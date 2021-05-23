package br.com.devmedia.Generics.testes;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        List<Dog> dogList = criarArray(new Dog());
        System.out.println(dogList);
        criarArraySemRetorno(new Cat());

    }
    public static <T> List<T> criarArray(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println("Lista com retorno");
        return lista;
    }

    public static <T> void criarArraySemRetorno(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println("lista sem retorno");
    }
}
