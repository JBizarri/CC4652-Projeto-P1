
package hotel;


public class LDE {
   protected No primeiro;
   protected No ultimo;
   protected int n;
   
   public LDE(){
       primeiro = null;
       ultimo = null;
       n = 0;
   }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
   
   

   
   public boolean insere(Pessoa p){
       No novo = new No(p);
       if(novo == null){
           return false;
       }
       No anterior = null;
       No atual = primeiro;
       
       while(atual!=null && atual.p.getCpf() < p.getCpf()){
           anterior = atual;
           atual = atual.proximo;
       }
       novo.proximo = atual;
       if(anterior!=null){
           anterior.proximo = novo;
       }else{
           primeiro = novo;
       }
       n++;
       return true;
   }
   
   public boolean remove(Pessoa p){
       No atual = primeiro;
       No anterior = null;
       
       while(atual!=null && atual.p.getCpf() < p.getCpf()){
           anterior = atual;
           atual = atual.proximo;
       }
       
       if(atual!=null && atual.p.getCpf() == p.getCpf()){
           if(anterior!=null){
               anterior.proximo = atual.proximo;
           }else{
               primeiro = atual.proximo;
           }
           return true;
       }else{
           return false;
       }
       
       
   }
   
   public Pessoa busca(int cpf){
       No atual = primeiro;
       
       while(atual.proximo !=null && atual.p.getCpf() < cpf){
           atual = atual.proximo;
       }
       
       if(atual.p.getCpf() == cpf){
           return atual.p;
       }else{
           return null; 
       }
   }

}
