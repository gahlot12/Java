/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.* ;
import java.io.*; 

class Solution {
    public int getCeil(int[] a, int n, int x) {
        int ans = -1;
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] >= x) {
                ans = a[mid];
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
                ans = a[mid];
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
    
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        Solution obj = new Solution();
        int[] result = new int[2];
        result[0] = obj.getFloor(a, n, x);
        result[1] = obj.getCeil(a, n, x);
        return result;
    }
}

public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 3;
        int[] result = Solution.getFloorAndCeil(arr, arr.length, x);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
	}
}
