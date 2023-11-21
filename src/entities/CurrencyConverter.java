package entities;

public class CurrencyConverter {
    public  static double dolar;
    public  static double total;
    public static double conversao(){
        return dolar * total * 106/100;
    }

}
