// 1051. Height Checker
// Solved
// Easy
// Topics
// Companies
// Hint
// A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

// Return the number of indices where heights[i] != expected[i].

 

// Example 1:

// Input: heights = [1,1,4,2,1,3]
// Output: 3
// Explanation: 
// heights:  [1,1,4,2,1,3]
// expected: [1,1,1,2,3,4]
// Indices 2, 4, and 5 do not match.
// Example 2:

// Input: heights = [5,1,2,3,4]
// Output: 5
// Explanation:
// heights:  [5,1,2,3,4]
// expected: [1,2,3,4,5]
// All indices do not match.
// Example 3:

// Input: heights = [1,2,3,4,5]
// Output: 0
// Explanation:
// heights:  [1,2,3,4,5]
// expected: [1,2,3,4,5]
// All indices match.

public class Ques2 {
    public static void sort(int arr[],int size){
        int min_index ;
        for(int i = 0;i<size;i++){
            min_index = i;
            for(int j = i+1;j<size;j++){
                if(arr[j]<arr[min_index])min_index = j;
            }
            if(i != min_index){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int expected[] = new int[n];
        for(int i = 0;i<n;i++){
            expected[i] = heights[i];
        }
        sort(expected,n);
        int count = 0;
        for(int i = 0;i<n;i++){
            if(expected[i] != heights[i])count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,4,2,1,3};
        int arr1[] = {5,1,2,3,4};
        int arr2[] = {1,2,3,4,5};
        System.out.println(heightChecker(arr));
        System.out.println(heightChecker(arr1));
        System.out.println(heightChecker(arr2));
    }
}
