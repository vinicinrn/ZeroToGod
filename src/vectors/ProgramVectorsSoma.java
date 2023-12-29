package vectors;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVectorsSoma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int vectA[] = new int[n];
        int vectB[] = new int [n];
        int vectC[] = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i<vectA.length; i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i<vectB.length; i++){
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++ ){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i<vectC.length; i++){
            System.out.printf("%d\n", vectC[i]);
        }

        sc.close();
    }
}
