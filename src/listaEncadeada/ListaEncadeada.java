package listaEncadeada;

public class ListaEncadeada {
    
    private No referenciaEntradaLista;
    private int tamanhoLista;


    public ListaEncadeada(){
        referenciaEntradaLista = null;
    }

    public boolean isEmpty(){
        
        return referenciaEntradaLista == null ? true :false;
        
    }

    public int size(){
        
        if(tamanhoLista <= 0){
            return 0;
        }else{
            return tamanhoLista;
        }
        
    }

    public void add(No novo){
        if(isEmpty()){
            referenciaEntradaLista = novo;
            novo.setProximoNo(null);
            tamanhoLista++;
            
        }else{
            novo.setProximoNo(referenciaEntradaLista);
            referenciaEntradaLista = novo;
            tamanhoLista++;                 
        }

        
    }

    public void add(No novo, int index){
        
        
        try {
            if(isEmpty() && index == 0){
                referenciaEntradaLista = novo;
                novo.setProximoNo(null);
            }
    
            if(!isEmpty() && index != size()-1 && index != 0){
                No auxiliar = referenciaEntradaLista;
                No anterior = referenciaEntradaLista;
                while(auxiliar.getIndice() != index){
                    anterior = auxiliar;
                    auxiliar = auxiliar.getProximoNo();                            
                }
                novo.setProximoNo(auxiliar.getProximoNo());
                anterior.setProximoNo(novo);    
            }

            if(!isEmpty() && index == 0){
                No auxiliar = referenciaEntradaLista;
                No anterior = referenciaEntradaLista;
                while(auxiliar.getIndice() != 0){
                    anterior = auxiliar;
                    auxiliar = auxiliar.getProximoNo();
                }
                novo.setProximoNo(null);
                anterior.setProximoNo(novo);

            }

            if(!isEmpty() && index == size()-1){
                referenciaEntradaLista.setDado(novo.getDado());
                
            }
        } catch (NullPointerException e) {
            System.out.println("Índice inexistente");
        }
    }

    public No get(int index){
        No auxiliar = referenciaEntradaLista;
        if(index < size()){
            while(auxiliar.getIndice() != index){
                auxiliar = auxiliar.getProximoNo();
            }
        return auxiliar;
        }

        return null;
    }

    public No remove(int index){
        
        No auxiliar = referenciaEntradaLista;
        No anterior = referenciaEntradaLista;

        if(index < 0){
            return null;
        }
        
        if(!this.isEmpty() && index < this.size()){

            while(auxiliar.getIndice() != index){
                anterior = auxiliar;
                auxiliar = auxiliar.getProximoNo();
            }

            anterior.setProximoNo(auxiliar.getProximoNo());

            if(index == size() - 1){
                referenciaEntradaLista = anterior.getProximoNo();
            }

        }else{
            return null;
        }
        
        tamanhoLista--;
        return auxiliar;
    }

    @Override
    public String toString() {
        No auxiliar = referenciaEntradaLista;
        String retorno = "";

        if(this.isEmpty()){
            System.out.println("[A lista está vazia]");
        }else{
            while(auxiliar != null){
                
                retorno += "=>";
                retorno += auxiliar;
                auxiliar = auxiliar.getProximoNo();
            }
        }
        retorno += "||Início da lista||";
        return retorno;
    }


}
