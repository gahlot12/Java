import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int maxi = Integer.MIN_VALUE; // Corrected to use Integer.MIN_VALUE
        System.out.println("Enter 10 numbers:");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        System.out.println("Maximum value entered: " + maxi);
    }
}
