package br.com.devmedia.Construtores.This;

public class Animal {
    private double peso;
    private String grupo;
    //gerar getters and setters

    public Animal() {
        this(6.0, "Aves"); //this(); com parametros chamou o construtor da linha 12
    }

    public Animal(double peso, String grupo) {
        System.out.println("Construtor Sobrecarregado");
        this.peso = peso;
        this.grupo = grupo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public static void main(String[] args) {
        Animal b = new Animal();
        System.out.println("Peso: " + b.getPeso() + " Grupo: " + b.getGrupo());
    }
}
