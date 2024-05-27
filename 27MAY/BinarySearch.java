/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution solution = new Solution();
        
        // Example usage
        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int resultIndex = solution.search(nums, target);
        
        if (resultIndex != -1) {
            System.out.println("Target " + target + " found at index " + resultIndex);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
	}
}
