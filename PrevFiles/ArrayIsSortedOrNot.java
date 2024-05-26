import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int maxi = Integer.MIN_VALUE; // Corrected to use Integer.MIN_VALUE
        System.out.println("Enter 10 numbers:");
        for(int i = 0 ; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i = 0;i<9;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("Array is not sorted");
                isSorted = false;
                break;
            }
        }
        if(isSorted == true)System.out.println("Array is sorted");
    }
}
