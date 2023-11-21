package application;
import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

//NOTA-SE
//AO ATRIBUIR METÓDO STATIC, NÃO É NECESSÁRIO INSTANCIAR OBJETOS DA CLASSE!!!
public class ProgramCalc {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume:  %.2f%n", v);
        System.out.printf("Valor do PI:  %.2f%n", Calculator.PI);

        sc.close();
    }
}
