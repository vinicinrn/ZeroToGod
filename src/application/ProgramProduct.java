package application;

import entities.Product;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product(); //declarando

        System.out.println("Enter product data: ");
        System.out.print("Name:");
        product.name = sc.nextLine();  //lendo o nome e guardando
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock");
        int quantity = sc.nextInt(); //get value
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);


        System.out.println();
        System.out.println("Updated data: " + product);


    sc.close();
    }
}
