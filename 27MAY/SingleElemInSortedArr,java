class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)return nums[0];

        int s = 0;
        int e = nums.length -1;

        while(s<e){
            int mid = s + (e-s)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1])s = mid;
                else e = mid;
            }
            else{
                if(nums[mid-1]==nums[mid])s = mid+1;
                else e = mid-1;
            }
        }
        return nums[s];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        
        System.out.println("Single element in [1, 1, 2, 3, 3, 4, 4, 8, 8]: " + solution.singleNonDuplicate(nums1));
        System.out.println("Single element in [3, 3, 7, 7, 10, 11, 11]: " + solution.singleNonDuplicate(nums2));
    }
}
