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
        list = new Quarto[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public boolean insere(Quarto q){
        if(n<50)
            return false;
        int i;
        for(i=0;i<n && list[i].getNumero()<q.getNumero();i++ );
        
        for(int j=n;j>i;j--){
            list[i] = list[i-1];
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
    
    public Quarto busca(Quarto q){
        if(n<=0){
            return null;
        }
        int i;
        for(i=0;i<n && list[i].getNumero()!=q.getNumero();i++ );
        if(i>=n){
            return null;
        }else{
            return list[i];
        }
    }
    
    private int n;
    private Quarto list[];
    
    
    
}
