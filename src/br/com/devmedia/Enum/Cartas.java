package br.com.devmedia.Enum;

public enum Cartas {

    /***
     * basicamente o tipo enum se tratam de constantes escritas em maiusculo
     * com acesso private, possuem metodos como toString, Equals e Ordinal
     * para imprimir, comparar e retornar o indice das constantes declaradas.
     */

    J(11),Q(12),K(13),A(14);

    public int valorCarta;
    Cartas(int valor) {
        valorCarta = valor;
    }
}
