package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class JogadorTableModel extends AbstractTableModel{
    private String[] colunas = new String[] {"Nome", "Nacionalidade", "CPF", "Sexo", "Data de nascimento", "Posição"};
    private List <Jogador> linhas;
    
    // Construtores

    public JogadorTableModel() {
        this.linhas = new ArrayList<Jogador>();
    }
    

    public JogadorTableModel(List<Jogador> linhas) {
        this.linhas = new ArrayList<Jogador>(linhas);
    }
    

    @Override
    // conta a quantidade de linha e retorna esse valor
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    // retorna a quantidade de coluna
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Jogador cadastroJogador = linhas.get(rowIndex);
        
        switch (columnIndex){
            case 0:
                return cadastroJogador.getNome();
            case 1:
                return cadastroJogador.getNacionalidade();
            case 2:
                return cadastroJogador.getCpf();
            case 3:
                return cadastroJogador.getSexo();
            case 4:
                return cadastroJogador.getDataNascimento();
            case 5:
                return cadastroJogador.getPosicao();

            default:
                throw new IndexOutOfBoundsException("columnsIndex out of bounds");
        }
    }
    
    @Override
    public String getColumnName(int indiceColuna){
        return colunas[indiceColuna];
    }
    
    //@Override
    //public Class<?>getColumnClass(int indiceColuna){
    //    switch (indiceColuna){
    //        case 2:
    //            return Long.class;
    //        case 4:
    //            return Integer.class;
    //        default:
    //            return String.class;
    //    }
    //}
    
    // Modifica na linha e coluna especificadas - alteração de toodo o objeto de acordo
    public void setValueAt(Object valor, int indiceLinha, int indiceColuna){
        Jogador cadastroJogador = linhas.get(indiceLinha);
        
        switch (indiceColuna){
            case 0:
                cadastroJogador.setNome(valor.toString());
                break;
            case 1:
                cadastroJogador.setNacionalidade(valor.toString());
                break;
            case 2:
                cadastroJogador.setCpf(valor.toString());
                break; 
            case 3:
                cadastroJogador.setSexo(valor.toString());
                break;
            case 4:
                cadastroJogador.setDataNascimento(valor.toString());
                break;
            case 5:
                cadastroJogador.setPosicao(valor.toString());
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of Bounds");          
        }
        fireTableCellUpdated(indiceLinha, indiceColuna); // notifica que a celula foi atualizada
    }
    public void setValueAt(Jogador valor, int indiceLinha){
        Jogador cadastroJogador = linhas.get(indiceLinha);
        
        cadastroJogador.setNome(valor.getNome());
        cadastroJogador.setNacionalidade(valor.getNacionalidade());
        cadastroJogador.setCpf(valor.getCpf());
        cadastroJogador.setSexo(valor.getSexo());
        cadastroJogador.setDataNascimento(valor.getDataNascimento());
        cadastroJogador.setPosicao(valor.getPosicao());
       
        
        fireTableCellUpdated(indiceLinha, 0);
        fireTableCellUpdated(indiceLinha, 1);
        fireTableCellUpdated(indiceLinha, 2);
        fireTableCellUpdated(indiceLinha, 3);
        fireTableCellUpdated(indiceLinha, 4);
        fireTableCellUpdated(indiceLinha, 5);
    }
    
    // verifica se é editável a célula
    @Override
    public boolean isCellEditable(int indiceLinha, int indiceColuna){
        return false;
    }
    
    public Jogador getJogador (int indiceLinha){
        return linhas.get(indiceLinha);
    }
    
    // Adicionar os registros
    public void addJogador(Jogador cadastroJogador){
        linhas.add(cadastroJogador);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
    // remove uma linha
    // Remove uma linha
    public void removeJogador(int indiceLinha){
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }
    
    //Adiciona uma lista no final do registro
    public void addLista(List<Jogador>cadastroJogador){
        // tamanho antigo da tabela
        int ultimoTamanho = getRowCount();
        // adicionar os registros
        linhas.addAll(cadastroJogador);
        fireTableRowsInserted(ultimoTamanho, getRowCount() - 1);
    }
    // Remove todos os registros
    public void limpar(){
        linhas.clear();
        fireTableDataChanged();
    }
    
    // verifica se a tabela está vazia
    public boolean isEmpty(){
        return linhas.isEmpty();
    }
    
}
