package br.com.devmedia.operacoes;

public class Matematica {
    public static boolean odd(int n) {
        if ((n % 2) == 1)
            return(true);
        else return(false);
    }

    public static double divisao(double dividendo, double divisor) {
        if (divisor == 0)
            return(0);
        else return(dividendo / divisor);
    }

    public static double porcento(float parcial, float total) {
        return(divisao(parcial, total) * 100);
    }
}
