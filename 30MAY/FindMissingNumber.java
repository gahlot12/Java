class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i = 0;i<n;i++){
            sum-=nums[i];
        }
        return sum;
    }
}
public class FindMissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Output for nums1: " + solution.missingNumber(nums1));

        // Example 2
        int[] nums2 = {0, 1};
        System.out.println("Output for nums2: " + solution.missingNumber(nums2));

        // Example 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Output for nums3: " + solution.missingNumber(nums3));
    }
}
