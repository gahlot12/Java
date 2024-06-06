// sum of 1st consecutive integers
import java.util.Scanner;
public class RecursionQ1{
    public static int sum(int k){
        if(k==0)return 0;
        return k+sum(k-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to find sum :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        System.out.println(sum(n));
    }
}
