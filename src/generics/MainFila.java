package generics;

public class MainFila {
    
    public static void main(String[] args) {
        
        Fila<Integer> fila = new Fila<Integer>();
        fila.enqueue(57);
        fila.enqueue(76);
        fila.enqueue(23);
        fila.enqueue(100);
        System.out.println(fila);
        fila.dequeue();
        fila.dequeue();
        System.out.println(fila);
    }
}
