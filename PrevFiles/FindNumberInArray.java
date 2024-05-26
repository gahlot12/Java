import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 898, 6, 65};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search in the array");
        int numberToSearch = sc.nextInt();
        boolean found = false; // Flag to indicate if the number is found
        for (int i = 0; i < arr.length; i++) {
            if (numberToSearch == arr[i]) {
                System.out.println("Number is present at position : " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number is not present");
        }
    }
}
