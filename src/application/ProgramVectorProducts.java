package application;

import entities.ProductV;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorProducts {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ProductV [] vect = new ProductV[n];

        for (int i=0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductV(name, price);
        }

        double sum = 0.0;
        for (int i=0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / n;
        System.out.printf("AVG Price: %.2f", avg);

    }
}
