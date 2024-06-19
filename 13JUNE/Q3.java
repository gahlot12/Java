// sort this {-5,-2,5,2,4,7,1,8,0,-8} arr to {-8,8,-5,5,-2,2,0,1,4,7}

import java.util.Arrays;

public class Q3{
    public static void main(String[] args) {
        int arr[] = {-5,-2,5,2,4,7,1,8,0,-8};
        int n = arr.length;
        int arr2[] = new int[n];
        boolean visited[] = new boolean[n];
        Arrays.sort(arr);
        
        int k = 0;
        for(int i = 0; i < n; i++) {
            if (!visited[i]) {
                for(int j = i+1; j < n; j++) {
                    if (arr[i] == -arr[j] && !visited[j]) {
                        arr2[k++] = arr[i];
                        arr2[k++] = arr[j];
                        visited[i] = visited[j] = true;
                        break;
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            if (!visited[i]) {
                arr2[k++] = arr[i];
            }
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}