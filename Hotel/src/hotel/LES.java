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

import java.util.ArrayList;

public class LES<Quarto> {
    public LES(int n){
        this.n = 0;
        ArrayList<Quarto> e = new ArrayList<>();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    /*public boolean insere(Quarto q){
        if(n<50)
            return false;
        int i;
        for(i=0;i<n;i++ ){
           
        }
        n++;
        return true;
    }*/
    
    private int n;
    
    
    
}
