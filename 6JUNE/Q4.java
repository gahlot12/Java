import java.util.Scanner;

public class Q4 {
    public static double mypower(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double half = mypower(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        double x;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose power is to find: ");
        x = sc.nextDouble();
        System.out.println("Enter the power of the number: ");
        n = sc.nextInt();
        sc.close();

        double ans;
        if (n >= 0) {
            ans = mypower(x, n);
        } else {
            x = 1 / x;
            if (n==Integer.MIN_VALUE) {
                n = -(n + 1);
                double result = mypower(x, n);
                ans = result * x;
            }
            else{
            n = -n;
            ans = mypower(x, n);
            }
        }
        System.out.println("Result: " + ans);
    }
}
