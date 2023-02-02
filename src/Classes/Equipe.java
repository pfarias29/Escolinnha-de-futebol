
package Classes;
public class Equipe {
    private String nomeEquipe;
    private String categoria;
    private String sexo;

    public Equipe() {
    }

    public Equipe(String nomeEquipe, String categoria, String sexo) {
        this.nomeEquipe = nomeEquipe;
        this.categoria = categoria;
        this.sexo = sexo;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}