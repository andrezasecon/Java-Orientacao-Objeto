package aplication;

import java.util.Scanner;

public class ProgramMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //DECLARAÇÃO DE MATRIZ BIDIMENSIONAL

        for (int i=0; i<mat.length; i++) { // PERCORRE A LINHA DA MATRIZ
            for (int j=0; j<mat[i].length; j++) { // PERCORRE A COLUNA DA MATRIZ NO NUMERO DE LINHAS i
                mat[i][j] = sc.nextInt(); // FAZ A LEITURA DA LINHA E COLUNA
            }
        }

        System.out.println("Main diagonal:");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);


        sc.close();
    }
}
