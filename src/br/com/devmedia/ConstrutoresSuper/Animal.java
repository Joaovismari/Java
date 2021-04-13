package br.com.devmedia.ConstrutoresSuper;

public class Animal {
    private double peso;
    private String grupo;

    public Animal() {
        super();
        System.out.println("Construtor de Animal");
    }

    public Animal(double peso, String grupo) {
        this();
        System.out.println("Construtor sobrecarregado de Animal");
    }
}

    class Dog extends Animal {
    private String raca;
    private String porte;

    public Dog() {
        super(5.6, "Mamiferos");
        System.out.println("Construtor de Dog");
    }

    public Dog(String raca, String porte) {
        this();
        System.out.println("Construtor sobrecarregado de Dog");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Vira Lata", "Médio");
    }
}
