// Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

// Example 1:

// Input: nums = [-1,2,1,-4], target = 1
// Output: 2
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// Example 2:

// Input: nums = [0,0,0], target = 1
// Output: 0
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

import java.util.Arrays;

public class ThreeSumClosestQ2 {

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        int closestSum = Integer.MAX_VALUE;

        for(int i = 0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-sum);

                if(diff < mindiff){
                    mindiff = diff;
                    closestSum = sum;
                }
                if(sum<target){
                    j++;
                }
                else if(sum>target){
                    k--;
                }
                else{
                    return sum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }
}
