package fila;

public class MainFila {
    
    public static void main(String[] args) {
        
        Fila fila = new Fila();
        System.out.println(fila);
        fila.dequeue();
        fila.enqueue(new No(5));
        System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        
        
        

       

    }
}
