package br.com.devmedia.HerançaeAcesso;

public class esportivo extends  carro{
    public static void main(String[] args) {
        esportivo sp = new esportivo();
        sp.velocidade = 25.32;
        sp.acelerar(25);
        System.out.println(sp.velocidade);
    }


}
