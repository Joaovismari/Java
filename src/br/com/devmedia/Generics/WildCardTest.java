package br.com.devmedia.Generics;

import jdk.swing.interop.SwingInterOpUtils;

abstract class Animal {
    public abstract void consulta();
}

class Dog extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
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
        consultarAnimais(cachorro);
        consultarAnimais(gato);
        consultarAnimais(animais);
    }

    public static void consultarAnimais(Animal[] animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }
    }

}



