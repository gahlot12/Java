// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

// Example 1:

// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
// Output: [2,2,2,1,4,3,3,9,6,7,19]
// Example 2:

// Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
// Output: [22,28,8,6,17,44]




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques1{
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int m = arr1.length, n = arr2.length;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(arr1[j]==arr2[i]){
                    result.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] != -1){
                result.add(arr1[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
        int arr3[] = relativeSortArray(arr1,arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}