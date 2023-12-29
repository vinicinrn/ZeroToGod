package vectors;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdpares = 0;
        int n;

        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        int vect[] = new int[n];

        for (int i=0; i<vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNumeros PARES: ");

        for (int i=0; i<n; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                qtdpares++;
            }
        }

        System.out.printf("\nQuantidade de pares: %d", qtdpares);
        sc.close();
    }

}
