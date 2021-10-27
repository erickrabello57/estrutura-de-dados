package generics;

import estudandoNo.No;
import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        
    Aluno aluno = new Aluno("João", 8, "4º ano");
        
    }

    // Unkown wildcard - imprime listas de qualquer tipo de objeto
    public static void imprimieLista(List<?> lista){

        for(Object obj: lista){
            System.out.println(obj);
        }
    }

    // Upper bounded wildcard - imprime lista de pessoas e de subclasses
    public static void imprimeLista(List<? extends Pessoa> listaPessoas){
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }

    // Lower bounded wildcard - imprime lista de super classes de Pessoa

    public static void imprimeLista2(List<? super Pessoa> listaPessoas){
        for (Object p : listaPessoas) {
            System.out.println(p);
        }
        
    }
}


