package br.com.devmedia.Strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        //formas de declaração
        String minhaString1 = new String();
        minhaString1 = "Java";
        String minhaString2 = "Java";
        String minhaString3 = new String("Java");
        String minhaString4 = "";

        char[] meusChars = new char[] {'J','a','v','a'};
        String minhaString5 = new String(meusChars);
        System.out.println(minhaString5);

        //replace substitui uma sequencia de caracteres ou um unico caractere dentro da string
        String s = "Este comentário foi péssimo!";
        s = s.replace("péssimo","Maravilhoso");
        System.out.println(s);

        //trim retira os espaços em branco no começo e fim da string
        String t = " Java Magazine ";
        t = t.trim();
        System.out.println(t);

        //contains retorna um boolean, util para busca em String
        String c = "001MARCOS PAULO     M19803112";
        System.out.println(c.contains("MARCOS"));

        //lenght retorna o numero de caracteres da String
        System.out.println(" Java ".length());

        //toLowerCase() e toUpperCase() convertem todos os caracteres pra minusculo ou maiusculo
        String s5 = "rodolfo rodrigues";
        String s6 = "Alfredo Augusto";
        System.out.println(s5.toUpperCase());
        System.out.println(s6.toLowerCase());

        //substring captura os caracteres iniciando no indice passado como parametro
        String ss = "Universidade";
        System.out.println(ss.substring(7));

        //teste de mutabilidade
        String s1 = "Meu nome era ";
        String s2 = "Michel";
        String s3 = s1;
        s1.replace("era","é");
        String s4 = s3.replace("era","sempre foi ");
        s3 = s4 + s2;
        System.out.println(s3.charAt(4));
        System.out.println(s3);
    }
}
