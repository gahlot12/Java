import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return nums[i];
        }
        return -1;
    }
}

public class FindDuplicates {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 2, 3, 4, 4};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {1, 1, 2, 3, 4};
        
        System.out.println("Duplicate in nums1: " + sol.findDuplicate(nums1));
        System.out.println("Duplicate in nums2: " + sol.findDuplicate(nums2));
        System.out.println("Duplicate in nums3: " + sol.findDuplicate(nums3));
    }
}
