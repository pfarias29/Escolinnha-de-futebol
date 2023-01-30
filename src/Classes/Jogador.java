package Classes;

import java.util.ArrayList;

public class Jogador extends Pessoa{
    // Atributos
   // private String nomeCompleto;
    private String nacionalidade;
    //private String cpf;
    //private String sexo; 
    //private int idade;
    private String posicao;
    
    // RELACIONAMENTO 
    // REFERÊNCIA JOGADOR -> EQUIPE
    //private ArrayList<Equipe> equipe;
    
    // Construtores
    
    //public Jogador() {
    //}

    //public Jogador(ArrayList<Equipe> equipe) {
    //    this.equipe = equipe;
        
    //}
    
    public Jogador(String nome, String sobrenome, String cpf, String sexo, String dataNascimento, String nacionalidade, String posicao) {
        //super(nome, sobrenome, cpf, sexo, dataNascimento);
        //this.nomeCompleto = nome;
        this.nacionalidade = nacionalidade;
        //this.cpf = cpf;
        //this.sexo = sexo;
        //this.idade = idade;
        this.posicao = posicao;
    }
    
    // Métodos
    // Cadastrar, excluir, alterar, pesquisar
    public void cadastrar(){
    }
    
    public void alterar(){
    }
    
    public void excluir(){
    }
    
    public void pesquisar(){
    }
    
    // Métodos especiais 

    //public String getNomeCompleto() {
    //    return nomeCompleto;
    //}

    //public void setNomeCompleto(String nomeCompleto) {
    //    this.nomeCompleto = nomeCompleto;
    //}

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    //public long getCpf() {
    //    return cpf;
    //}

    //public void setCpf(long cpf) {
    //    this.cpf = cpf;
    //}

    //public String getSexo() {
    //    return sexo;
    //}

    //public void setSexo(String sexo) {
    //    this.sexo = sexo;}

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    //public int getIdade() {
    //    return idade;
    //}

    //public void setIdade(int idade) {
    //    this.idade = idade;
    //}

    //public ArrayList<Equipe> getEquipe() {
    //    return equipe;
    //}

    //public void setEquipe(ArrayList<Equipe> equipe) {
    //    this.equipe = equipe;
    //}
    
    
    
}
