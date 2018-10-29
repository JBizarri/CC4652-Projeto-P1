
package hotel;


public class Fila {
    private int começo;
    private int fim;
    private Pessoa p[];
    private int n;
    
    public Fila(){
        começo = 0;
        fim = 0;
        p = new Pessoa[51];
        n = 51;        
    }
    
    
    public boolean insere(Pessoa pessoa){
        if(((fim+1)%n) == começo){
            return false;
        }
        p[fim] = pessoa;
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
}
