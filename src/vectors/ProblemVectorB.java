package vectors;

import java.util.Locale;
import java.util.Scanner;

public class ProblemVectorB {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media;
        int n;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        double vect[] = new double[n];

        for (int i = 0; i<vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i< vect.length; i++){
            soma = soma + vect[i];
        }

        media = soma / n;
        System.out.print("Valores = ");

        for (int i = 0; i<vect.length; i++){
            System.out.printf("%.2f", vect[i]);
        }


        System.out.printf("\nSOMA: %.2f", soma);
        System.out.printf("\nMEDIA: %.2f", media );

    }
}
