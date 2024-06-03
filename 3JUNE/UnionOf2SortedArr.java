// Problem statement
// Given two sorted arrays, ‘a’ and ‘b’, of size ‘n’ and ‘m’, respectively, return the union of the arrays.

// The union of two sorted arrays can be defined as an array consisting of the common and the distinct elements of the two arrays. The final array should be sorted in ascending order.

// Note: 'a' and 'b' may contain duplicate elements, but the union array must contain unique elements.

// Example:
// Input: ‘n’ = 5 ‘m’ = 3
// ‘a’ = [1, 2, 3, 4, 6]
// ‘b’ = [2, 3, 5]

// Output: [1, 2, 3, 4, 5, 6]

// Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
// Distinct elements in ‘a’ are: [1, 4, 6]
// Distinct elements in ‘b’ are: [5]
// Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :
// 5 3
// 1 2 3 4 6
// 2 3 5
// Sample Output 1 :
// 1 2 3 4 5 6
// Explanation Of Sample Input 1 :
// Input: ‘n’ = 5 ‘m’ = 3
// ‘a’ = [1, 2, 3, 4, 6]
// ‘b’ = [2, 3, 5]

// Output: [1, 2, 3, 4, 5, 6]

// Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
// Distinct elements in ‘a’ are: [1, 4, 6]
// Distinct elements in ‘b’ are: [5]
// Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]
// Sample Input 2:
// 4 3
// 1 2 3 3
// 2 2 4
// Sample Output 2:
// 1 2 3 4
// Explanation Of Sample Input 2 :
// Input: ‘n’ = 5 ‘m’ = 3
// ‘a’ = [1, 2, 3, 3]
// ‘b’ = [2, 2, 4]

// Output: [1, 2, 3, 4]

// Explanation: Common elements in ‘a’ and ‘b’ are: [2]
// Distinct elements in ‘a’ are: [1, 3]
// Distinct elements in ‘b’ are: [4]
// Union of ‘a’ and ‘b’ is: [1, 2, 3, 4]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnionOf2SortedArr{
    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> unionArr = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;

        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            } else { // Both elements are equal
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) { // If any elements left in arr1
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }

        while (j < n2) { // If any elements left in arr2
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }

        Collections.sort(unionArr); // Sort the final array
        return unionArr;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6};
        int b[] = {2, 2, 4};

        List<Integer> result = sortedArray(a, b); // Call sortedArray method to get the union array

        // Print the result
        System.out.println("Union of the two sorted arrays is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}