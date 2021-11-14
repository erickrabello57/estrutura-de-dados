package listaEncadeada;

public class No {
    
    private Object dado;
    private int indice;
    public static int contador;
    private No proximoNo;


    public No(Object obj){
        dado = obj;
        indice = contador;
        contador++;
    }

    public Object getDado(){
        return dado;
    }

    public void setDado(Object o){
        dado = o;
    }

    public int getIndice(){
        return indice;
    }

    public No getProximoNo(){
        return proximoNo;
    }

    public void setProximoNo(No novoNo){
        this.proximoNo = novoNo;
    }

    public void setIndice(int index){
        this.indice = index;
    }

    @Override
    public String toString() {
        
        return "[Nó: {dado: " +this.getDado() + " || índice: "+ this.getIndice()+ "}]";
    }
}
