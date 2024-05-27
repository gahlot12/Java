// Search Insert Position
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
class Solution {
    public int getCeil(int[] a, int n, int x) {
        int ans = -1;
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] >= x) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public int getFloor(int[] a, int n, int x) {
        int ans = -1;
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] <= x) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
    
    public int searchInsert(int[] nums, int target) {
        int ceilIndex = getCeil(nums, nums.length, target);
        if (ceilIndex == -1) {
            return nums.length; // Insert at the end of the array
        } else if (nums[ceilIndex] == target) {
            return ceilIndex; // Target found at ceilIndex
        } else {
            return ceilIndex; // Insert just after the ceilIndex
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution solution = new Solution();
        
        // Test cases
        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;
        
        // Test searchInsert method
        System.out.println("Index to insert " + target1 + ": " + solution.searchInsert(nums, target1));
        System.out.println("Index to insert " + target2 + ": " + solution.searchInsert(nums, target2));
        System.out.println("Index to insert " + target3 + ": " + solution.searchInsert(nums, target3));
        System.out.println("Index to insert " + target4 + ": " + solution.searchInsert(nums, target4));
    }
}

