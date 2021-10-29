package estudandoPilha;

public class No {
    
    private int dado;
    private No referenciaProximoNo = null;

    public No(int num){
        this.dado = num;
    }

    public void setDado(int numero){
        this.dado = numero;
    }

    public int getDado(){
        return dado;
    }

    public void setReferenciaProximoNo(No inferior){
        this.referenciaProximoNo = inferior;
    }

    public No getReferenciaProximoNo(){
        return referenciaProximoNo;
    }

    
    @Override
    public String toString() {
        
        return "Dado do nó: " + this.getDado();
    }

}
