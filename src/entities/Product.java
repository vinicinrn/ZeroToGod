package entities;

public class Product {
    private String name; //atributos
    private double price;
    private int quantity;

    public Product(){
    }

    public Product(String name, double price, int quantity){  //constrututor
        this.name = name;                                    // this para referenciar o atributo do objeto
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){  //SOBRECARGA
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock(){
        return price*quantity;
    }
    public void addProducts(int quantity){
       this.quantity +=quantity; //autoreferencia do objeto, acessando o atributo da classe.
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){  //NÃO ACEITA PARAMETRIZAÇÃO //Converter objeto para string
        return name + ", $" + String.format("%.2f", price) + ", " + quantity +" units, total: $" + String.format("%.2f", totalValueInStock());
    }

}
