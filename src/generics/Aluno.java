package generics;

public class Aluno extends Pessoa{

    private String ano;

    public Aluno(String nome, Integer idade, String ano){
        super(nome, idade);
        this.ano = ano;
    }
}
