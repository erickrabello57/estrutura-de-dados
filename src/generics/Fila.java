package generics;

public class Fila {
    
    private No referenciaFimFila;

    public Fila(){
        referenciaFimFila = null;
    }

    public boolean isEmpty(){
        if(referenciaFimFila == null){
            return true;
        }
        return false;
    }

    public void enqueue(No novoNo){
        if(this.isEmpty()){
            referenciaFimFila = novoNo;
            novoNo.setProximoNo(null);
        }else{
            No auxiliar = referenciaFimFila;
            referenciaFimFila = novoNo;
            novoNo.setProximoNo(auxiliar);
            
        }
    }

    public No dequeue(){
        
        No dequeued = referenciaFimFila;
        No noAtual = dequeued;
        try {
            if(!isEmpty()){
                while(noAtual.getProximoNo().getProximoNo() != null){
                    noAtual = noAtual.getProximoNo();
                }
                dequeued = noAtual.getProximoNo();
                noAtual.setProximoNo(null);
                
                return dequeued;
                
            }else{
                return dequeued;
            }
        } catch (NullPointerException e) {
            referenciaFimFila = null;
        }
        return dequeued;
        
    }

    @Override
    public String toString() {
        No noAuxiliar = referenciaFimFila;
        String retorno = "";
    
        if(isEmpty()){
            retorno += "[A fila está vazia]\n";
            return retorno;
        }else{
            while(noAuxiliar != null){
                System.out.print(noAuxiliar + "=>") ; 
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }

        return retorno;
    }

} 

