package Classes;

import Telas.CriandoJogador;
import java.util.ArrayList;

public class Jogador extends Pessoa{

    // Atributos
    private String nacionalidade;
    private String posicao;
    

    public Jogador(String nome, String sobrenome, String nacionalidade, String cpf, String sexo, int idade, String dataNascimento, String posicao) {
        super(nome, sobrenome, cpf, sexo, idade, dataNascimento);
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;
    }
    
    // Métodos especiais 
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

    public void add(Jogador jogador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
