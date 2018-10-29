
package hotel;


public class No {
    protected Pessoa p;
    protected No proximo;
    
    public No(Pessoa p){
        this.p = p;
        proximo = null;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    
}
