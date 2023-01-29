package Classes;

public class Campeonato {
    private String nomeCampeonato;
    private String endereco;
    private String vencedor; //talvez o tipo ser equipe?
    private String sexo;
    private String dataInicio;
    private String dataFinal;
    private String categoria;
    
    public Campeonato() {}

    public Campeonato(String nomeCampeonato, String endereco, String vencedor, String sexo, String dataInicio, String dataFinal, String categoria) {
        this.nomeCampeonato = nomeCampeonato;
        this.endereco = endereco;
        this.vencedor = vencedor;
        this.sexo = sexo;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.categoria = categoria;
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public void setNomeCampeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}