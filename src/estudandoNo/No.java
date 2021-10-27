package estudandoNo;

public class No {
    
    private String conteudo;
    private No proximoNo;

    public No(String string){
        this.conteudo = string;
        this.proximoNo = null;
    }

    public void setConteudo(String s){
        this.conteudo = s;
    }

    public String getConteudo(){
        return this.conteudo;
    }

    public void setProximoNo(No no){
        this.proximoNo = no;
    }

    public No getProximoNo(){
        return this.proximoNo;
    }

    @Override
    public String toString(){
        return "Contéudo: " + this.getConteudo();
    }




}
