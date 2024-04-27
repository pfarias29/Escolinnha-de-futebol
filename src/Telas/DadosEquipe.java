/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Jogador;
import Classes.Tecnico;
import static Telas.Tecnicos.listaTecnicos;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felip
 */
public class DadosEquipe extends javax.swing.JFrame {
    private ArrayList<Jogador> listaJogadoresEquipe = new ArrayList<>();
    private ArrayList<String> listaJogadoresFiltrada = new ArrayList<>();
    private String botão;

    /**
     * Creates new form DadosEquipe
     */
    public DadosEquipe() {
        initComponents();
        
        File arquivo = new File("src/Dados/nomeEquipe.txt");
        
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            String nomeArquivo = br.readLine();
            String nomeArquivo2 = nomeArquivo+".txt";
            File arquivo2 = new File("src/Dados/dadosJogadores.txt");
            fr = new FileReader(arquivo2);
            br = new BufferedReader(fr);
                    
            String categoria;   
            int idade;
                    
            while(br.ready()){
                String linha = br.readLine();
                if(linha.split(";")[4].equals(nomeArquivo.split("_")[2])){
                    idade = Integer.parseInt(linha.split(";")[5]);
                    if(idade < 12) {
                        categoria = "Mirim";
                    } else if (idade < 14) {
                        categoria = "Infantil";
                    } else if (idade < 16) {
                        categoria = "Infanto Juvenil";
                    } else if (idade < 18) {
                        categoria = "Juvenil";
                    } else {
                        categoria = "Júnior";
                    }
                    if(categoria.equals(nomeArquivo.split("_")[1])){
                        listaJogadoresFiltrada.add(linha);
                    }
                }
            }
            File a = new File("src/Dados/"+nomeArquivo2);
            FileWriter fw = new FileWriter(a);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String jogador : listaJogadoresFiltrada){
                bw.write(jogador);
                bw.newLine();
            }
            bw.close();
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        carregarTabelaJogadoresEquipe();
        
        setLocationRelativeTo(null);
        
        //Habilitar ou desabilitar funções
        btnAdicionarJogador.setEnabled(false);
        
        //Habilitar ou desabilitar campos de textos
        txtNomeJogador.setEnabled(false);
        txtSobrenomeJogador.setEnabled(false);
        txtPosicaoJogador.setEnabled(false);
        txtIdadeJogador.setEnabled(false);
        txtNacionalidadeJogador.setEnabled(false);
        txtSexoJogador.setEnabled(false);
        txtDataNascimentoJogador.setEnabled(false);
        txtCPFJogador.setEnabled(true);
    }
    
    public void carregarTabelaJogadoresEquipe(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome", "Sobrenome", "Nacionalidade", "CPF", "Sexo", "Idade", "Data Nascimento","Posicao"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        for(int i=0;i<listaJogadoresFiltrada.size();i++){
            Object linha[] = new Object[] { listaJogadoresFiltrada.get(i).split(";")[0],
                                            listaJogadoresFiltrada.get(i).split(";")[1],
                                            listaJogadoresFiltrada.get(i).split(";")[2],
                                            listaJogadoresFiltrada.get(i).split(";")[3],
                                            listaJogadoresFiltrada.get(i).split(";")[4],
                                            listaJogadoresFiltrada.get(i).split(";")[5],
                                            listaJogadoresFiltrada.get(i).split(";")[6],
                                            listaJogadoresFiltrada.get(i).split(";")[7]};
            modelo.addRow(linha);
        }
        
        tblJogadoresEquipe.setModel(modelo);
        
        tblJogadoresEquipe.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblJogadoresEquipe.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblJogadoresEquipe.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblJogadoresEquipe.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblJogadoresEquipe.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblJogadoresEquipe.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblJogadoresEquipe.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblJogadoresEquipe.getColumnModel().getColumn(7).setPreferredWidth(100);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNacionalidadeJogador2 = new javax.swing.JLabel();
        txtNacionalidadeJogador1 = new javax.swing.JTextField();
        txtNacionalidadeJogador3 = new javax.swing.JTextField();
        txtNacionalidadeJogador5 = new javax.swing.JTextField();
        txtNacionalidadeJogador6 = new javax.swing.JTextField();
        pnlJogadoresNaEquipe = new javax.swing.JPanel();
        lblCPFJogador = new javax.swing.JLabel();
        lblNomeJogador = new javax.swing.JLabel();
        lblSobrenomeJogador = new javax.swing.JLabel();
        lblPosicaoJogador = new javax.swing.JLabel();
        txtCPFJogador = new javax.swing.JTextField();
        txtNomeJogador = new javax.swing.JTextField();
        txtSobrenomeJogador = new javax.swing.JTextField();
        txtPosicaoJogador = new javax.swing.JTextField();
        btnPesquisarJogador = new javax.swing.JButton();
        lblNacionalidadeJogador = new javax.swing.JLabel();
        txtIdadeJogador = new javax.swing.JTextField();
        lblIdadeJogador = new javax.swing.JLabel();
        lblDataNascimentoJogador = new javax.swing.JLabel();
        txtNacionalidadeJogador = new javax.swing.JTextField();
        txtSexoJogador = new javax.swing.JTextField();
        lblSexoJogador = new javax.swing.JLabel();
        txtDataNascimentoJogador = new javax.swing.JTextField();
        btnAdicionarJogador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJogadoresEquipe = new javax.swing.JTable();
        btnSairDadosEquipe = new javax.swing.JButton();

        lblNacionalidadeJogador2.setText("Idade:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogadores na Equipe");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/jogador.png")).getImage());

        pnlJogadoresNaEquipe.setBackground(new java.awt.Color(0, 153, 102));
        pnlJogadoresNaEquipe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jogadores na Equipe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblCPFJogador.setText("CPF:");

        lblNomeJogador.setText("Nome:");

        lblSobrenomeJogador.setText("Sobrenome");

        lblPosicaoJogador.setText("Posição:");

        btnPesquisarJogador.setText("Pesquisar");
        btnPesquisarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarJogadorActionPerformed(evt);
            }
        });

        lblNacionalidadeJogador.setText("Nacionalidade:");

        lblIdadeJogador.setText("Idade:");

        lblDataNascimentoJogador.setText("Data Nascimento:");

        lblSexoJogador.setText("Sexo:");

        javax.swing.GroupLayout pnlJogadoresNaEquipeLayout = new javax.swing.GroupLayout(pnlJogadoresNaEquipe);
        pnlJogadoresNaEquipe.setLayout(pnlJogadoresNaEquipeLayout);
        pnlJogadoresNaEquipeLayout.setHorizontalGroup(
            pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJogadoresNaEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJogadoresNaEquipeLayout.createSequentialGroup()
                        .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSobrenomeJogador)
                            .addComponent(lblPosicaoJogador))
                        .addGap(39, 39, 39)
                        .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlJogadoresNaEquipeLayout.createSequentialGroup()
                                .addComponent(txtSobrenomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addComponent(txtPosicaoJogador)))
                    .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlJogadoresNaEquipeLayout.createSequentialGroup()
                            .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCPFJogador)
                                .addComponent(lblNomeJogador))
                            .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlJogadoresNaEquipeLayout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(txtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJogadoresNaEquipeLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                    .addComponent(txtCPFJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlJogadoresNaEquipeLayout.createSequentialGroup()
                            .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNacionalidadeJogador)
                                .addComponent(lblIdadeJogador)
                                .addComponent(lblDataNascimentoJogador)
                                .addComponent(lblSexoJogador))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNacionalidadeJogador)
                                .addGroup(pnlJogadoresNaEquipeLayout.createSequentialGroup()
                                    .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSexoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIdadeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDataNascimentoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisarJogador)
                .addGap(367, 367, 367))
        );
        pnlJogadoresNaEquipeLayout.setVerticalGroup(
            pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJogadoresNaEquipeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFJogador)
                    .addComponent(txtCPFJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarJogador))
                .addGap(18, 18, 18)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeJogador)
                    .addComponent(txtNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenomeJogador)
                    .addComponent(txtSobrenomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicaoJogador)
                    .addComponent(txtPosicaoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNacionalidadeJogador)
                    .addComponent(txtNacionalidadeJogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdadeJogador)
                    .addComponent(txtIdadeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataNascimentoJogador)
                    .addComponent(txtDataNascimentoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlJogadoresNaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexoJogador)
                    .addComponent(txtSexoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnAdicionarJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adicionarCliente.png"))); // NOI18N
        btnAdicionarJogador.setText("Adicionar Jogador");
        btnAdicionarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarJogadorActionPerformed(evt);
            }
        });

        tblJogadoresEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Sobrenome", "Posicao", "Nacionalidade", "Idade", "Data Nascimento", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJogadoresEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJogadoresEquipeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJogadoresEquipe);

        btnSairDadosEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sair.png"))); // NOI18N
        btnSairDadosEquipe.setText("Sair");
        btnSairDadosEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairDadosEquipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(btnSairDadosEquipe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(btnAdicionarJogador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlJogadoresNaEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlJogadoresNaEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarJogador)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSairDadosEquipe)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarJogadorActionPerformed
        if(txtCPFJogador.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O cpf deve ser informado", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            String jogador;
            String nome = "",sobrenome="",posicao="",nacionalidade="",sexo="",data="";
            int idade=0;
            String cpfJogador = txtCPFJogador.getText();
            for(int i=0;i<listaJogadoresFiltrada.size();i++){
                jogador = listaJogadoresFiltrada.get(i);
                if(cpfJogador.equals(jogador.split(";")[3])){
                    nome = jogador.split(";")[0];
                    sobrenome = jogador.split(";")[1];
                    nacionalidade = jogador.split(";")[2];
                    cpfJogador = jogador.split(";")[3];
                    sexo = jogador.split(";")[4];
                    idade = Integer.parseInt(jogador.split(";")[5]);
                    data = jogador.split(";")[6];
                    posicao = jogador.split(";")[7];
                }
            }
            if(cpfJogador.equals("")){
                JOptionPane.showMessageDialog(null, "Este jogador não existe", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                //Limpar os campos
                txtNomeJogador.setText("");
                txtSobrenomeJogador.setText("");
                txtNacionalidadeJogador.setText("");
                txtCPFJogador.setText("");
                txtSexoJogador.setText("");
                txtIdadeJogador.setText("");
                txtDataNascimentoJogador.setText("");
                txtPosicaoJogador.setText("");
            }
            else{
                txtNomeJogador.setText(nome);
                txtSobrenomeJogador.setText(sobrenome);
                txtNacionalidadeJogador.setText(nacionalidade);
                txtCPFJogador.setText(cpfJogador);
                txtSexoJogador.setText(sexo);
                txtIdadeJogador.setText(String.valueOf(idade));
                txtDataNascimentoJogador.setText(data);
                txtPosicaoJogador.setText(posicao);
            }
            
            txtCPFJogador.selectAll();
            txtCPFJogador.requestFocus();
        }
    }//GEN-LAST:event_btnPesquisarJogadorActionPerformed

    private void btnAdicionarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarJogadorActionPerformed
        File arquivo = new File("src/Dados/nomeEquipe.txt");
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            String nomeArquivo = br.readLine();
            String nomeArquivo2 = nomeArquivo+".txt";
            File a = new File("src/Dados/"+nomeArquivo2);
            FileWriter fw = new FileWriter(a);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String jogador : listaJogadoresFiltrada){
                bw.write(jogador);
                bw.newLine();
            }
            bw.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAdicionarJogadorActionPerformed

    private void btnSairDadosEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairDadosEquipeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairDadosEquipeActionPerformed

    private void tblJogadoresEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJogadoresEquipeMouseClicked
        int i = tblJogadoresEquipe.getSelectedRow();
        if(i>=0 && i<listaJogadoresFiltrada.size()){
            String jogador = listaJogadoresFiltrada.get(i);
            String nome = jogador.split(";")[0];
            String sobrenome = jogador.split(";")[1];
            String nacionalidade = jogador.split(";")[2];
            String cpfJogador = jogador.split(";")[3];
            String sexo = jogador.split(";")[4];
            int idade = Integer.parseInt(jogador.split(";")[5]);
            String data = jogador.split(";")[6];
            String posicao = jogador.split(";")[7];
            txtNomeJogador.setText(String.valueOf(nome));
            txtSobrenomeJogador.setText(String.valueOf(sobrenome));
            txtNacionalidadeJogador.setText(String.valueOf(nacionalidade));
            txtCPFJogador.setText(String.valueOf(cpfJogador));
            txtSexoJogador.setText(String.valueOf(sexo));
            txtDataNascimentoJogador.setText(String.valueOf(data));
            txtIdadeJogador.setText(String.valueOf(idade));
            txtPosicaoJogador.setText(String.valueOf(posicao));
        }
        btnAdicionarJogador.setEnabled(true);
    }//GEN-LAST:event_tblJogadoresEquipeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DadosEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosEquipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarJogador;
    private javax.swing.JButton btnPesquisarJogador;
    private javax.swing.JButton btnSairDadosEquipe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPFJogador;
    private javax.swing.JLabel lblDataNascimentoJogador;
    private javax.swing.JLabel lblIdadeJogador;
    private javax.swing.JLabel lblNacionalidadeJogador;
    private javax.swing.JLabel lblNacionalidadeJogador2;
    private javax.swing.JLabel lblNomeJogador;
    private javax.swing.JLabel lblPosicaoJogador;
    private javax.swing.JLabel lblSexoJogador;
    private javax.swing.JLabel lblSobrenomeJogador;
    private javax.swing.JPanel pnlJogadoresNaEquipe;
    private javax.swing.JTable tblJogadoresEquipe;
    private javax.swing.JTextField txtCPFJogador;
    private javax.swing.JTextField txtDataNascimentoJogador;
    private javax.swing.JTextField txtIdadeJogador;
    private javax.swing.JTextField txtNacionalidadeJogador;
    private javax.swing.JTextField txtNacionalidadeJogador1;
    private javax.swing.JTextField txtNacionalidadeJogador3;
    private javax.swing.JTextField txtNacionalidadeJogador5;
    private javax.swing.JTextField txtNacionalidadeJogador6;
    private javax.swing.JTextField txtNomeJogador;
    private javax.swing.JTextField txtPosicaoJogador;
    private javax.swing.JTextField txtSexoJogador;
    private javax.swing.JTextField txtSobrenomeJogador;
    // End of variables declaration//GEN-END:variables
}
