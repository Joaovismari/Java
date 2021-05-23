package br.com.devmedia.Generics.testes;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        //type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Dinheiro");
        lista.add("Segurança");
        lista.add("Saúde");

        for (String obj:lista) {
            System.out.println(obj);
        }
    }
}
