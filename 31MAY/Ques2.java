// Java Program to find the frequency of each element in the array

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int arr[] = new int[9];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<9;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int freq[] = new int[9];
        int visited = -1;

        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    freq[j] = visited;  
                }  
            }  
            if(freq[i] != visited)  
                freq[i] = count;  
        }
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + freq[i]);  
        }  
        System.out.println("----------------------------------------");   
    }
}
