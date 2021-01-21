package aplication;

import exemplosArrays.Rent;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramHostel {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Rent #"+ (i+1) +":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Quarto: ");
            int rooms = sc.nextInt();
            Rent rent = new Rent(name, email);
            vect[rooms] = rent;


        }

       System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
            sc.close();
    }
}
