package generics;

public class No {
    
    private Object objeto;
    private No ProximoNo;

    public No(Object o){
        objeto = o;
    }

    public Object getObjeto(){
        return objeto;
    }

    public void setObjeto(Object obj){
        objeto = obj;
    }

    public No getProximoNo(){
        return ProximoNo;
    }

    public void setProximoNo(No proximoNo){
        ProximoNo = proximoNo;
    }

    @Override
    public String toString() {
        
        return "[Nó {dado: "+ this.getObjeto() + " }]";
    }




}
