// Median of Two Sorted Arrays
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

public class Ques6 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int m = nums1.length, n = nums2.length;
        int nums3[] = new int[m+n];
        
        int index1 = 0,index2 = 0,mainArrayIndex = 0;
        while(index1 < m && index2 < n){
            if(nums1[index1] < nums2[index2]){
                nums3[mainArrayIndex++] = nums1[index1++];
            }
            else{
                nums3[mainArrayIndex++] = nums2[index2++];
            }
        }
        while (index1 < m){
            nums3[mainArrayIndex++] = nums1[index1++];
        }

        while (index2 < n) {
             nums3[mainArrayIndex++] = nums2[index2++];
        }

        if((n+m)%2 == 0){
            median =  (nums3[(m + n)/2] + nums3[((m + n)/2) - 1])/2.0;
        }
        else{
            median =  nums3[(m + n)/2];
        }
        return median;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,2};
        int nums2[] = {3,4,5};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
