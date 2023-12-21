package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank bank;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(number, holder, initialDeposit);
        } else {
            bank = new Bank(number, holder);
        }

        System.out.println();
        System.out.println("Enter account data");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);
        System.out.println("Updated account data");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        bank.withdraw(withdrawValue);
        System.out.println("Updated account data");
        System.out.println(bank);


        sc.close();
    }
}
