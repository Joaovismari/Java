package br.com.devmedia.Matriz;

import java.util.Scanner;

public class MatrizSomaSubtracao {
    public static void main(String[] args) {
        int a[][], b[][], c[][];
        a = new int[2][2];
        b = new int[2][2];
        c = new int[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("insera os valores da primeira matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("posição[%d][%d] = ", i, j);
                a[i][j] = input.nextInt();
            }
        }


        System.out.println("insera os valores da segunda matrix");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.printf("posição[%d][%d] = ", i, j);
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("soma dos valores na terceira matrix");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.printf(c[i][j] + " ");
            }
        }


    }
}
