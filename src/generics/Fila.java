package generics;

public class Fila<T> {
    
    private No<T> referenciaFimFila;

    public Fila(){
        referenciaFimFila = null;
    }

    public boolean isEmpty(){
        if(referenciaFimFila == null){
            return true;
        }
        return false;
    }

    public void enqueue(T object){
        No novoNo = new No(object);
        if(this.isEmpty()){
            referenciaFimFila = novoNo;
            novoNo.setProximoNo(null);
        }else{
            No<T> auxiliar = referenciaFimFila;
            referenciaFimFila = novoNo;
            novoNo.setProximoNo(auxiliar);
            
        }
    }

    public No<T> dequeue(){
        
        No<T> dequeued = referenciaFimFila;
        No<T> noAtual = dequeued;
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
        No<T> noAuxiliar = referenciaFimFila;
        String retorno = "";
    
        if(isEmpty()){
            retorno += "[A fila está vazia]\n";
            return retorno;
        }else{
            retorno += "Início da fila";
            while(noAuxiliar != null){
                System.out.print(noAuxiliar + "=>") ; 
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }

        return retorno;
    }

} 

