package br.com.devmedia.Generics.testes;

import br.com.devmedia.Generics.classes.Carro;
import br.com.devmedia.Generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("GOL"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por 1 mês");
        carroAlugavel.devolverObjeto(carro);

        System.out.println("-------------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("IBM"));
        computadoresDisponiveis.add(new Computador("MAC PRO"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando o computador por 1 mês");
        computadorAlugavel.devolverObjeto(computador);
    }
}

class ObjetosAlugaveis<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    //alugar
    public T getObjetoDisponivel() {

        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto: " + t);
        System.out.println("Objetos Disponiveís: " + objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo Objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos Disponiveís: " + objetosDisponiveis);
    }
}

class doisAtributos<T,X>{
    T um;
    X dois;

    public doisAtributos(T um, X dois) {
        this.um = um;
        this.dois = dois;
    }

    public T getUm() {
        return um;
    }

    public void setUm(T um) {
        this.um = um;
    }

    public X getDois() {
        return dois;
    }

    public void setDois(X dois) {
        this.dois = dois;
    }
}