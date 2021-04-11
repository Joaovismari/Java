package br.com.devmedia.Strings;

public class SBuilder {
    public static void main(String[] args) {
        //o metodo "append" concatena a string de forma mais eficiente, consumindo menos memoria
        StringBuilder nomes = new StringBuilder();
        nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");

        System.out.println(nomes.toString());
        //uso de StringBuilder com retornos de capacidade

        StringBuilder buffer = new StringBuilder("João Silveira Batista");
        System.out.printf(" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + " +
                        "16(valor inicial padrão)) = %d\n\n",
                buffer.toString(),buffer.length(),buffer.length(),buffer.capacity());

        //EXPANDE A CAPACIDADE P/ 75 CARACTERES
        buffer.ensureCapacity(75);
        System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());

        //REDEFINE O TAMANHO, NÃO APARECENDO OS CARACTERES
        // SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
        buffer.setLength(10);
        System.out.printf("Novo tamanho = %d\n buffer = %s\n",buffer.length(),
                buffer.toString());
    }
}
