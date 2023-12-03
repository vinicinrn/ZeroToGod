package application;
import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x; //assumindo um retangulo x qualquer
        x = new Rectangle(); //instanciando o retangulo //construtor padrão.

        System.out.print("Informe a base do retangulo: ");
        x.b = sc.nextDouble();
        System.out.print("Informe a altura do retangulo: ");
        x.h = sc.nextDouble();

        double areax = x.area();
        double perimeterx = x.perimeter();
        double diagonalx = x.diagonal();

        System.out.printf("Area = %.2f%n", areax);
        System.out.printf("Perimeter = %.2f%n" , perimeterx);
        System.out.printf("Diagonal = %.2f", diagonalx);

        sc.close();
    }
}
