class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

public class RemoveDuplicatesFromSoretedArr {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 2};
        // int[] expectedNums1 = {1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Example 1:");
        System.out.println("Output: " + k1);

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // int[] expectedNums2 = {0, 1, 2, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Example 2:");
        System.out.println("Output: " + k2);
    }
}