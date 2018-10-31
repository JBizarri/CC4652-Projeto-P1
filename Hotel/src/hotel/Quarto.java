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
public class Quarto {
    public Quarto(int numero, float preco,int tipo){
        this.numero = numero;
        this.preco = preco;
        this.tipo = tipo;
        tempo = 0;
        ocupado = false;
        reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public float precoTotal(){
        return preco*tempo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    
    
    
    
    protected int numero;
    protected float preco;
    protected int tempo;
    protected boolean ocupado;
    protected int tipo;
    protected boolean reservado;
    
}
