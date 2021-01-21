package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArraysPrimitivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



             // EXEMPLO 1 DE ARRAY DE ELEMENTO DO TIPO VALOR (TIMPO PRIMITIVO)

            int n = sc.nextInt();// pede ao user o tamanho do array q será atribuido a N

            // [] declara um ARRAY(ARRANJO), aqui passando n como tamanho
            double[] vect = new double[n]; // Aloca o ARRAY na memoria com as n posições acima

            // para percorrer o Array de n posições utilizar o for iniciando o i com zero
            // limitando a n posições (enquanto i for menor q n, percorre o ARRAY)
            for (int i = 0; i < n; i++) {
                vect[i] = sc.nextDouble(); // digita o valor a ser inserido em cada posição do ARRAY
            }

            double sum = 0.0;

            for (int i = 0; i < n; i++) {
                sum += vect[i];
            }

            double avp = sum / n;

            System.out.printf("AVERAGE HEIGHT:  %.2f%n", avp);
            sc.close();

    }
}
