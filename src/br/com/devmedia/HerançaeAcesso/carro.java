package br.com.devmedia.HerançaeAcesso;

public class carro {
    private int portas;
    public double velocidade;

    public void acelerar(double x){
        System.out.println("correndo à: "+this.velocidade+" kms por hora");
        this.velocidade += x;
        System.out.println("acelerando ...+ "+x+" kms por hora");
        System.out.println("velocidade atual: "+this.velocidade+" kms por hora");
    }
}
