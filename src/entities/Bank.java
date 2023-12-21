package entities;

public class Bank {
    private Integer number;
    private String holder;
    private double balance;


    public Bank(Integer number, String holder) { //construtor caso NAO fazer deposito inicial
        this.number = number;
        this.holder = holder;
    }

    public Bank (Integer number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
         deposit(initialDeposit); //construtor CASO SIM fazer deposito inicial
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount){
        balance = balance + amount;
    }
    public void withdraw (double amount){
        balance = balance - amount + 5.0;
    }

    public String toString(){
        return "Account " + number + ", Holder:" + holder + ", Balance: $" + String.format("%.2f", balance);
    }
}
