package entities;

public class Product {
    public String name;
    public double price;
    public int quantity; //atributo

    public Product(String name, double price, int quantity){  //constrututor
        this.name = name;                                    // this para referenciar o atributo do objeto
        this.price = price;
        this.quantity = quantity;
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

    public String toString(){  //NÃO ACEITA PARAMETRIZAÇÃO
        return name + ", $" + String.format("%.2f", price) + ", " + quantity +" units, total: $" + String.format("%.2f", totalValueInStock());
    }

}
