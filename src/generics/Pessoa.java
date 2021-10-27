package generics;

public class Pessoa {
    
    private String nome;
    private Integer idade;
    
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        
        return "Nome: " + this.nome + "\n" + "idade: " + this.idade;
    }
}
