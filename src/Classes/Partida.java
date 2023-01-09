package Classes;
import java.util.ArrayList;
public class Partida {
    // atributos
    private String data;
    private float horario;
    private String local;
    private String resultado;
    
    // RELACIONAMENTO 
    // REFERÊNCIA EQUIPE -> PARTIDA
    private ArrayList<Equipe> equipe;
    
    // REFERÊNCIA EQUIPE -> ARBITRO
    private ArrayList<Arbitro> arbitro;
    
    // Construtores

    public Partida(ArrayList<Equipe> equipe, ArrayList<Arbitro> arbitro) {
        this.equipe = equipe;
        this.arbitro = arbitro;
    }
    
    
    public Partida() {
        //this.arbitro = new ArrayList();
        //this.equipe = new ArrayList();
    }

    public Partida(String data, float horario, String local, String resultado) {
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.resultado = resultado;
    }
    
    // Métodos
    // Cadastrar, excluir, alterar, pesquisar
    //public void adicionarEquipe(){
    //}
    
    public void cadastrarPartida(){
    }
    
    public void alterar(){
    }
    
    public void excluir(){
    }
    
    public void pesquisar(){
    }
    
    // Métodos especiais

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getHorario() {
        return horario;
    }

    public void setHorario(float horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public ArrayList<Equipe> getEquipe() {
        return equipe;
    }

    public void setEquipe(ArrayList<Equipe> equipe) {
        this.equipe = equipe;
    }

    public ArrayList<Arbitro> getArbitro() {
        return arbitro;
    }

    public void setArbitro(ArrayList<Arbitro> arbitro) {
        this.arbitro = arbitro;
    }
    
    
    
}
