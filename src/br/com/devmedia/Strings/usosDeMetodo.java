package br.com.devmedia.Strings;

public class usosDeMetodo {
    public static void main(String[] args) {

        //compareTo em união a substring
        String texto = "A API de Strings é uma das mais utilizadas na linguagem Java";
        String linguagem = texto.substring(texto.indexOf("Java"), texto.length());

        if (linguagem.compareToIgnoreCase("java") == 0) {
            System.out.println("compareToIgnoreCase: Encontrei a linguagem! Ela é " + linguagem);
        }

        if(linguagem.compareTo("java") == 0) {
            System.out.println("compareTo: Encontrei a linguagem! Ela é " + linguagem);
        }

        String nome1 = "Carlos";
        String nome2 = "Carla";

        System.out.println("nome2.compareTo(nome1) = "+nome2.compareTo(nome1));
        System.out.println("nome1.compareTo(nome2) = "+nome1.compareTo(nome2));

        //retornos em forma de String
        double numero = 102939939.939;
        boolean booleano = true;

        System.out.println("Retorna Valor : " + String.valueOf(numero));
        System.out.println("Retorna Valor: " + String.valueOf(booleano));

        //metodos de busca "começam com" ou "terminam com"
        String[] nomes = {"iniciado", "iniciando", "finalizado", "finalizando"};

        for (String recebeNomes : nomes) {
            if (recebeNomes.startsWith("in"))
                System.out.printf("\"%s\" inicia com \"in\" \n", recebeNomes);
        }

        System.out.println();

        for (String recebeNomes : nomes) {
            if (recebeNomes.startsWith("ici", 2))
                System.out.printf("\"%s\" inicia com \"ici\" na posição 2 \n", recebeNomes);
        }

        System.out.println();

        for (String recebeNomes : nomes) {
            if (recebeNomes.endsWith("ado"))
                System.out.printf("\"%s\" termina com \"ado\" \n", recebeNomes);
        }
    }
}
