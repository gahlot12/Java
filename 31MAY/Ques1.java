// Java Program to copy all elements of one array into another array

import java.util.Scanner;

public class Ques1{
    public static void main(String[] args) {
        int arr1[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int arr2[][] = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr2[i][j]=arr1[i][j];
                System.out.print( arr2[i][j]);
            }
            System.out.println();
        }
    }
}