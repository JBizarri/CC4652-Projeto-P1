/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author unifgnascimento
 */
public class Pessoa {
    public Pessoa(String nome, String endereco, String cidade, String contato, int cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.contato = contato;
        this.cpf = cpf;
        hospedado = false;
        quarto = -1;
        
    }
    
    
      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    

    public boolean isHospedado() {
        return hospedado;
    }

    public void setHospedado(boolean hospedado) {
        this.hospedado = hospedado;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
    
    
    
    
    protected String nome;
    protected String endereco;
    protected String cidade;
    protected String contato;
    protected int cpf;
    protected boolean hospedado;
    protected int quarto;

  
    
    
    
}
