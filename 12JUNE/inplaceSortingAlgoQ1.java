// Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

public class inplaceSortingAlgoQ1 {
    public static void sortColors(int[] nums) {
        //bubble sort
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
    public static void main(String[] args) {
        int num1[] = {2,0,2,1,1,0};
        sortColors(num1);
        for (int i : num1) {
            System.out.print(i+" ");
        }
    }
}