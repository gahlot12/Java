// Minimum Increment to Make Array Unique

// You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.

// Return the minimum number of moves to make every value in nums unique.

// The test cases are generated so that the answer fits in a 32-bit integer.

// Example 1:

// Input: nums = [1,2,2]
// Output: 1
// Explanation: After 1 move, the array could be [1, 2, 3].
// Example 2:

// Input: nums = [3,2,1,2,1,7]
// Output: 6
// Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
// It can be shown with 5 or less moves that it is impossible for the array to have all unique values.

import java.util.Arrays;

public class Q1{
    public static int minIncrementForUnique(int[] nums) {
        int minIncrements = 0;
        Arrays.sort(nums);

        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                int increment = nums[i-1]-nums[i]+1;
                minIncrements +=  increment;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return minIncrements;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
}