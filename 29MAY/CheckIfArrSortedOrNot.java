class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]){
                count++;
                if(count > 1) return false;
            }
        }
        return true; 
    }
}

public class CheckIfArrSortedOrNot {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};
        int[] arr3 = {1, 2, 4, 3, 5};
        
        System.out.println("Is arr1 almost sorted? " + solution.check(arr1)); 
        System.out.println("Is arr2 almost sorted? " + solution.check(arr2)); 
        System.out.println("Is arr3 almost sorted? " + solution.check(arr3)); 
    }
}
