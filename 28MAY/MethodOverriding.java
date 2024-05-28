import java.util.Scanner;

class Shapes {
    public double calculateArea(){
        return 0;
    }
}

class Circle extends Shapes{
    private int radius;
    Circle(int radius){
        this.radius = radius;
    }
    
    //Method Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Method Override
    public double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shapes shape1 = new Circle(5); 
        Shapes shape2 = new Rectangle(4, 6); 

        System.out.println("Area of Circle: " + shape1.calculateArea()); 
        System.out.println("Area of Rectangle: " + shape2.calculateArea()); 
    }
}
