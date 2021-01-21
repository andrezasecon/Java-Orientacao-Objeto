package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArraysObjetos {

    public static void main(String[] args) {

        // EXEMPLO 2 ARRAY DE TIPO REFERENCIA (OBJETO)

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt(); // pede ao user o tamanho do ARRAY
        Product[] vect = new Product[n]; //instancia um ARRAY do tipo referencia(objeto)

        for (int i = 0; i < vect.length; i++) { // percorre o ARRAY, pode ser usado a variavel N ou vect.length
            sc.nextLine(); //consumindo a quebra de linha pendente do sc acima

            System.out.println("Digite o nome do produto: ");
            String name = sc.nextLine(); // lê o nome do produto
            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble(); // lê o preço do produto
            vect[i] = new Product(name, price); //faz vect[i] apontar para o objeto
            // Product que contem nome e preço
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice(); //acessa o vetor na posição i e pega somente o price
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();

    }
}
