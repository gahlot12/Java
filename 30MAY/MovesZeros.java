import java.util.Arrays;

class Solution {
    public int[] moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[nonZeroIndex++] = nums[i];
            }
        }
        for(int i = nonZeroIndex; i < n; i++){
            nums[i] = 0;
        }
        return nums;
    }
}

public class MovesZeros {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {0, 2, 0, 4, 5};
        int[] arr2 = {1, 0, 2, 4, 5};
        int[] arr3 = {1, 2, 0, 0, 5};
        
        System.out.println(Arrays.toString(solution.moveZeroes(arr1))); 
        System.out.println(Arrays.toString(solution.moveZeroes(arr2))); 
        System.out.println(Arrays.toString(solution.moveZeroes(arr3))); 
    }
}
