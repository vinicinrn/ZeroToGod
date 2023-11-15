package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;


public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee x;
        x = new Employee(); //instanciando um funcionario x qualquer

        System.out.print("Digite seu nome: ");
        x.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        x.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        x.tax = sc.nextDouble();

        double netSalaryX = x.netSalary();
        System.out.print("Nome: " +x.name + ", $" +netSalaryX);

        System.out.println();
        System.out.println("Insira uma porcentagem para aumentar o salário");
        double percentageX = sc.nextDouble();
        x.increaseSalary(percentageX);

        System.out.println();
        System.out.print(x.toString());

        sc.close();

    }
}
