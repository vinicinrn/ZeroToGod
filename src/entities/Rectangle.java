package entities;

public class Rectangle {
    public double b; //base
    public double h; //altura
    public double area(){
        return b*h;
    }
    public double perimeter (){
        return b+b+h+h;
    }
    public double diagonal (){
        return Math.sqrt(b*b + (h*h));
    }
}
