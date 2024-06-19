// Rearrange Array Elements by Sign
// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

// Example 1:

// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Explanation:
// The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
// The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
// Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
// Example 2:

// Input: nums = [-1,1]
// Output: [1,-1]
// Explanation:
// 1 is the only positive integer and -1 the only negative integer in nums.
// So nums is rearranged to [1,-1].


public class Q3 {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arrangedArr[] = new int[n];
        int posInd = 0,negInd = 1;
        for(int i = 0;i<n;i++){
            if(nums[i]>0){
                arrangedArr[posInd] = nums[i];
                posInd+=2;
            }
            else{
                arrangedArr[negInd] = nums[i];
                negInd+=2;
            }
        }
        return arrangedArr;
    }

    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int arr[] = rearrangeArray(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
