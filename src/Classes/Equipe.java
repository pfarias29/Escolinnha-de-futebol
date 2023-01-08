package Classes;
public class Equipe {
    private String nomeEquipe;
    private int idade;
    private String sexo;

    public Equipe() {
    }

    public Equipe(String nomeEquipe, int idade, String sexo) {
        this.nomeEquipe = nomeEquipe;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}