package br.com.devmedia.Strings;

public class ManipulandoMetodos {
    public static void main(String[] args) {
        String valor = "DEVMEDIA - Java";

        System.out.println(valor.endsWith("Java"));
        System.out.println(valor.startsWith("DEV"));
        System.out.println(valor.startsWith("ME", 3));
    //convertendo a String pra um rray do tipo char
        for(char c : valor.toCharArray()){
            System.out.println("Char: "+c);
        }

    //uso de Split para separação, retorna um array de strings
        valor = "DEVMEDIA - Java";
        String[] valorComSplit = valor.split("-");

        for(String s : valorComSplit){
            System.out.println(s);
        }
    //subsequence retorna  sequencia de chars, substring um string
        System.out.println(valor.subSequence(0, 5));
        System.out.println(valor.substring(11, 15));

    //uso do format primeiro se passa a String depois a variavel que será substituida
        String result = String.format("Hoje nós processamos %,d transações", 100000);
        System.out.println(result);

        result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
        System.out.println(result);
    }
}
