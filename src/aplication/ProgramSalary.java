package aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSalary {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.groosSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);

        sc.close();

    }
}
