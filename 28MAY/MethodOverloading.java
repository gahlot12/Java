import java.util.Scanner;

class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }
    public String add(String a, String b, String c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Different examples of method calls
        System.out.println("Addition of 5 and 7: " + calculator.add(5, 7));
        System.out.println("Addition of 5, 7, and 10: " + calculator.add(5, 7, 10));
        System.out.println("Addition of 3.5 and 2.5: " + calculator.add(3.5, 2.5));
        System.out.println("Concatenation of 'Hello' and 'World': " + calculator.add("Hello", "World"));
        System.out.println("Concatenation of 'Hello', ' ', and 'World': " + calculator.add("Hello", " ", "World"));
    }
}
