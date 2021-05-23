package br.com.devmedia.Generics.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Dog extends Animal implements  Comparable {
    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Cat extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Dog[] cachorro = {new Dog(), new Dog()};
        Cat[] gato = {new Cat(), new Cat()};
        Animal[] animais = {new Dog(), new Cat()};
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        consultarAnimaisList(dogList);
        consultarAnimaisList(catList);
        ordenarLista(dogList);
    }

    public static void consultarAnimais(Animal[] animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }
    }
    // caractere coringa ?
    public static void consultarAnimaisList(List<? extends  Animal> animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }
    }

    public static  void consultarCachorroList(List <? super Dog> cachorroList){
        Dog c1 = new Dog();
        Animal a1 = new Dog();
        Object o1 = new Dog();
        cachorroList.add(new Dog());
    }

    public static  void ordenarLista(List <? extends  Comparable> lista){
        Collections.sort(lista);
    }

}



