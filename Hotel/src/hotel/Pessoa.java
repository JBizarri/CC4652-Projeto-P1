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
    public Pessoa(String nome, String endereco, String cidade, String contato){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.contato = contato;
        hospedado = false;
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

    public boolean isHospedado() {
        return hospedado;
    }

    public void setHospedado(boolean hospedado) {
        this.hospedado = hospedado;
    }
    
    
    protected String nome;
    protected String endereco;
    protected String cidade;
    protected String contato;
    protected boolean hospedado;

  
    
    
    
}
