package generics;

public class No<T> {
    
    private T objeto;
    private No<T> proximoNo;

    public No(T o){
        objeto = o;
    }

    public Object getObjeto(){
        return objeto;
    }

    public void setObjeto(T obj){
        objeto = obj;
    }

    public No getProximoNo(){
        return proximoNo;
    }

    public void setProximoNo(No proximoNo){
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        
        return "[Nó {dado: "+ this.getObjeto() + " }]";
    }




}
