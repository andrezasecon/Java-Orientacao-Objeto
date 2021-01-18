package aplication;

import entities.Retangle;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangle {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle rect = new Retangle();

        System.out.println("Enter rectangle width and height: ");
        rect.height = sc.nextDouble();
        rect.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n",  rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());

        sc.close();

    }
}
