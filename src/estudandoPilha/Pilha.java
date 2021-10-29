package estudandoPilha;

public class Pilha {
    
    private No referenciaTopoPilha;

    public Pilha(){
        this.referenciaTopoPilha = null;
    }

    public No top(){
        return referenciaTopoPilha;
    }
    
    public boolean isEmpty(){
        if(referenciaTopoPilha == null){
            return true;
        }
        return false;
    }

    public void push (No outroNo){
        
        No referenciaAux = referenciaTopoPilha;
        this.referenciaTopoPilha = outroNo;
        referenciaTopoPilha.setReferenciaProximoNo(referenciaAux);
    }

    public No pop(){
        if(!this.isEmpty()){
            
            No poped = referenciaTopoPilha;
            referenciaTopoPilha = referenciaTopoPilha.getReferenciaProximoNo();
            return poped;
        }

        return null;
    }

    @Override
    public String toString() {
        String retorno = "-------------\n";
        retorno += "Pilha\n";
        retorno +="-------------\n";
        
        No auxiliar = this.referenciaTopoPilha;

        while(true){
            if(auxiliar != null){
                retorno += "[Nó{dado = "+ auxiliar.getDado() + " }]\n";
                auxiliar = auxiliar.getReferenciaProximoNo();

            }else{
                break;
            }
        }
        
        retorno += "===================";
        return retorno;
    }
}
