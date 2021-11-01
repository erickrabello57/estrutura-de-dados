package fila;

public class MainFila {
    
    public static void main(String[] args) {
        
        Fila fila = new Fila();
        //System.out.println(fila);
        fila.dequeue();
        fila.enqueue(new No(5));
        fila.enqueue(new No(10));
        fila.enqueue(new No(15));
        fila.enqueue(new No(20));
        fila.enqueue(new No(25));
        fila.enqueue(new No(30));
        fila.enqueue(new No("Julia"));
        System.out.println(fila);
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        System.out.println();
        System.out.println(fila);
        /* System.out.println(fila);
        fila.dequeue();
        System.out.println(fila);
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        System.out.println(fila);
        fila.dequeue();
        System.out.println();
        System.out.println(fila); */
        
        
        

       

    }
}
