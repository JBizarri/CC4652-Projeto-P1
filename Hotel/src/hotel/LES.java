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



public class LES {
    public LES(){
        this.n = 0;
        list = new Quarto[50];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public boolean insere(Quarto q){
        if(n==50)
            return false;
        int i;
        
        for(i=0;i<n && list[i].getNumero()<q.getNumero();i++ );
        
        for(int j=n;j>i;j--){
            list[j] = list[j-1];
        }
        list[i] = q;
           
        n++;
        return true;
    }
    
    public boolean remove(Quarto q){
        if(n<=0){
            return false;
        }
        int i;
        for(i=0;i<n && list[i].getNumero()!=q.getNumero();i++ );
        
        for(int j=i;j<n;j++){
            list[j] = list[j+1];
        }
        if(i>=n){
            return false;
        }else{
            n--;
        }
        return true;
    }
    
    public Quarto busca(int numero){
        if(n<=0){
            return null;
        }
        int i;
        for(i=0;i<n && list[i].getNumero()!=numero;i++ );
        if(i>=n){
            return null;
        }
        return list[i];
    }
    
    private int n;
    private Quarto list[];
    
    
    
}
