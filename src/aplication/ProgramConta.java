package aplication;

import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

public class ProgramConta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter account number: ");
        int num = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there a initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);

        if(resp == 'y') {

            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta = new Conta(num, holder, initialDeposit);
        }
        else {
            conta = new Conta(num, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta.toString());

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        conta.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(conta.toString());

        System.out.print("Enter a withdraw value: ");
        double sac = sc.nextDouble();
        conta.withdraw(sac);

        System.out.println("Updated account data: ");
        System.out.println(conta.toString());







        sc.close();
    }
}
