//Fibonnacci no.

import java.util.Scanner;

public class RecursionQ2 {
    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to find Fibonacci number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        System.out.println(Fibonacci(n));
    }
}
