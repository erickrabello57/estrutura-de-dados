package estudandoNo;

public class Main {
    
    public static void main(String[] args) {
       No<String> no1 = new No<String>("Primeiro nó"); 
       No<String> no2 = new No<String>("Segundo nó");
       No<String> no3 = new No<String>("Terceiro nó");
       No<String> no4 = new No<String>("Quarto nó");


       no1.setProximoNo(no2);
       no2.setProximoNo(no3);
       no3.setProximoNo(no4);
       no4.setProximoNo(null);

       System.out.println(no1);
       System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());


        
    }
}
