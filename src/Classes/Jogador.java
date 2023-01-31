package Classes;

import java.util.ArrayList;

public class Jogador extends Pessoa{
    private String nacionalidade;
    private String posicao;
    
    public Jogador(String nome, String sobrenome, String nacionalidade, String cpf, String sexo, int idade, String dataNascimento, String posicao) {
        super(nome, sobrenome, cpf, sexo, idade, dataNascimento);
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }  
}
