package br.com.devmedia;

import br.com.devmedia.operacoes.Matematica;

public class testes {
    public static void main(String[] args) {

        int n = (int)Math.round(Math.random() * 100);
        int m = (int)Math.round(Math.random() * 100);
        System.out.printf("numero %s dividido por %s = %s",n,m, Matematica.divisao(n,m));
        System.out.println();

    }


}

