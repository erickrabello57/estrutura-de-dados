package fila;

public class Fila {
    
    private No referenciaInicioFila;

    public Fila(){
        referenciaInicioFila = null;
    }

    public boolean isEmpty(){
        if(referenciaInicioFila == null){
            return true;
        }
        return false;
    }

    public void enqueue(No novoNo){
        if(this.isEmpty()){
            referenciaInicioFila = novoNo;
            novoNo.setProximoNo(null);
        }else{
            No auxiliar = referenciaInicioFila;
            referenciaInicioFila = novoNo;
            novoNo.setProximoNo(auxiliar);
            
        }
    }

    public No dequeue(){
        
        No dequeued = referenciaInicioFila;
        No noAtual = dequeued;
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
    }

    @Override
    public String toString() {
        No noAuxiliar = referenciaInicioFila;
        String retorno = "------------\n";
        retorno += "Início da fila\n";
        retorno += "------------\n";

        if(isEmpty()){
            retorno += "[A fila está vazia]\n ============";
            return retorno;
        }else{
            while(noAuxiliar != null){
                System.out.println(noAuxiliar);
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }

        
        return retorno;

    }


} 

