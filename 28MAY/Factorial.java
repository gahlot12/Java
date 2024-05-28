import java.util.Scanner;

class Factorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = Factorial.factorial(n); // Calling factorial method from Factorial class
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
