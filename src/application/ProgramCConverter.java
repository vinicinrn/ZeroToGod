package application;
import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;


public class ProgramCConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* METODO STATIC, NAO PRECISO INSTANCIAR O OBJETO
        CurrencyConverter conversor;
        conversor = new CurrencyConverter();
                */

        System.out.print("Qual o preço do dólar: ");
        CurrencyConverter.dolar = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        CurrencyConverter.total = sc.nextDouble();

        System.out.print("Total pago em reais (IOF 6% acrescido):  " + CurrencyConverter.conversao());

        sc.close();
    }
}
