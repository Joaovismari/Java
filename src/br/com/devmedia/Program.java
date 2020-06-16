package br.com.devmedia;

public class Program {
    public static void main(String[] args) {
        //exemplo de instanciação de classe simples em java, utilizando método da classe HelloWorld
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

        String cor ="Verde";

        if (cor.equals("Verde")){
            System.out.println("Andar");
        }else {
            System.out.println("Parar e Aguardar");
        }


    }
}
