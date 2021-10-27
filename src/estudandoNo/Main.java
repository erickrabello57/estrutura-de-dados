package estudandoNo;

public class Main {
    
    public static void main(String[] args) {
       No no1 = new No("Primeiro nó"); 
       No no2 = new No("Segundo nó");
       No no3 = new No("Terceiro nó");
       No no4 = new No("Quarto nó");


       no1.setProximoNo(no2);
       no2.setProximoNo(no3);
       no3.setProximoNo(no4);
       no4.setProximoNo(null);

       System.out.println(no1);
       System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());


        
    }
}
