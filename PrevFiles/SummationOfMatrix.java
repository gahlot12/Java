import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[][] arr1 = new int[2][3];
        Scanner sc = new Scanner(System.in);
        
        // Input for the first matrix
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Input for the second matrix
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        // Adding the matrices
        int[][] sum = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++){
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        
        // Displaying the sum matrix
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
