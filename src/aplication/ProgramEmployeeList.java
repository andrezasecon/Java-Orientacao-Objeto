package aplication;

import entities.EmployeeComLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployeeList {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeComLista> list = new ArrayList<>();

        // PART 1 - READING DATA:

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.println("Nome: ");
            sc.close();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new EmployeeComLista(id, name, salary));

            // PART 3 - LISTING EMPLOYEES:

            System.out.println();
            System.out.println("List of employees:");
            for (EmployeeComLista obj : list) {
                System.out.println(obj);
            }

            sc.close();
        }
    }

public static boolean hasId(List<EmployeeComLista> list, int id) {
            EmployeeComLista emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;
        }
}
