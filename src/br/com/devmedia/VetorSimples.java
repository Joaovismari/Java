package br.com.devmedia;

public class VetorSimples {
    private static final int hora = 0;

    public static void main(String[] args) {
        int n = 5;                          // tamanho do vetor
        int[] nota = {80, 70, 90, 85, 100}; // declarando e alimentando o vetor
        int i;                              // índice ou subscrito

        // percorrendo todos os valores armazenados no vetor
        int soma = 0;
        for (i = 0; i < n; i++) {
            System.out.printf("nota[%d] = %d\n", i, nota[i]);
            soma = soma + nota[i];
        }

        double media = soma / (double) n;
        System.out.printf("\nMédia Aritmética Simples = %.2f\n", media);
        String nome = "João";
        int salario = 9999999;
        String s = String.format("salario %d", salario);
        System.out.print(nome + " " + s);




    }
}
