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
        this.arbitro = new ArrayList();
        this.equipe = new ArrayList();
    }

    public Partida(String data, float horario, String local, ArrayList<Arbitro> arbitro, ArrayList<Equipe> equipeA, ArrayList<Equipe> equipeB, String resultado) {
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.resultado = resultado;
        this.equipe = equipeA;
        this.equipe = equipeB;
        this.arbitro = arbitro;
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

    public void addEquipe(Equipe equipe) {
        this.equipe.add(equipe);
    }

    public ArrayList<Arbitro> getArbitro() {
        return arbitro;
    }

    public void addArbitro(Arbitro arbitro) {
        this.arbitro.add(arbitro);
    }

    public void add(Partida partida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
