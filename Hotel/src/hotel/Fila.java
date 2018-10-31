
package hotel;


public class Fila {
    private int começo;
    private int fim;
    private Quarto q[];
    private int n;
    
    public Fila(){
        começo = 0;
        fim = 0;
        q = new Quarto[51];
        n = 51;        
    }
    
    
    public boolean insere(Quarto quarto){
        if(((fim+1)%n) == começo){
            return false;
        }
        q[fim] = quarto;
        fim = (fim+1)%n;
        return true;
    }
    
    public boolean remove(){
        if(fim == começo){
            return false;
        }
        começo = (começo+1)%n;
        return true;
    }
    
    public Quarto primeiro(){
        return q[começo];
    }
}
