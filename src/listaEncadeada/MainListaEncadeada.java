package listaEncadeada;

public class MainListaEncadeada {
    
    public static void main(String[] args) {
        
        
        ListaEncadeada lista = new ListaEncadeada();
        System.out.println(lista.isEmpty());
        No no = new No("A");
        No no1 = new No("B");
        No no2 = new No("C");
        No no3 = new No("Teste");
        No no4 = new No("D");
        No no5 = new No("E");
        lista.add(no);
        lista.add(no1);
        lista.add(no2);
        lista.add(no3);
        lista.add(no4);
        System.out.println(lista);
        System.out.println();
        //iqSystem.out.println(lista.remove(5));
        System.out.println();
        lista.add(no5, 0);
        System.out.println(lista);
        
        

    }
}
