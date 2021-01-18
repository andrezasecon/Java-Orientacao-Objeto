package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNotas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student est = new Student();

        System.out.println("Nome: ");
        est.name = sc.nextLine();

        System.out.println("Nota1: ");
        est.nota1 = sc.nextDouble();

        System.out.println("Nota2: ");
        est.nota2 = sc.nextDouble();

        System.out.println("Nota3: ");
        est.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n",  est.finalGrade() );
        if (est.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING: %.2f POINTS%n", est.missingPoints());
        }else
        System.out.println("PASS");


    }


}
