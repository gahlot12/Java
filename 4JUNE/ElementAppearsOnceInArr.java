// You are given a sorted array 'arr' of positive integers of size 'n'.
// It contains each number exactly twice except for one number, which occurs exactly once.
// Find the number that occurs exactly once.
// Example :
// Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
// Output: 2
// Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2.

public class ElementAppearsOnceInArr {
    
    public static int getSingleElement(int []arr){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,8,3,8};
        System.out.println(getSingleElement(arr));
    }
}
