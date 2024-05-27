// . Find Minimum in Rotated Sorted Array

// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// You must write an algorithm that runs in O(log n) time.

 

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] rotated 3 times.
// Example 2:

// Input: nums = [4,5,6,7,0,1,2]
// Output: 0
// Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
// Example 3:

// Input: nums = [11,13,15,17]
// Output: 11
// Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 

class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int min = nums[0];
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < min) {
                min = nums[mid];
                e = mid - 1; // Move towards the left part of the array
            } else if (nums[mid] > nums[e]) { // Compare with the rightmost element
                s = mid + 1; // Move towards the right part of the array
            } else {
                e = mid - 1; // If nums[mid] <= nums[e], move towards the left part (unrotated)
            }
        }
        return min;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {11, 13, 15, 17};
        
        System.out.println("Minimum in rotated array [3, 4, 5, 1, 2]: " + solution.findMin(nums1));
        System.out.println("Minimum in rotated array [4, 5, 6, 7, 0, 1, 2]: " + solution.findMin(nums2));
        System.out.println("Minimum in rotated array [11, 13, 15, 17]: " + solution.findMin(nums3));
    }
}
