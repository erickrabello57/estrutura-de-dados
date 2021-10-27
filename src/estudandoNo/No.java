package estudandoNo;

public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return this.conteudo;
    }

    public void setProximoNo(No<T> no){
        this.proximoNo = no;
    }

    public No<T> getProximoNo(){
        return this.proximoNo;
    }

    @Override
    public String toString(){
        return "Contéudo: " + this.getConteudo();
    }




}
