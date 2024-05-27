// Ninja is given a pattern. Now he is asked to print the same pattern for any given ‘N’ number of rows.

// Note:

// There is only one space between the values of each column in a row.

// For example, Pattern for ‘N’ = 5 will be.
// 1 2 3 4 5 
// 11 12 13 14 15 
// 21 22 23 24 25 
// 16 17 18 19 20 
// 6 7 8 9 10 
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input1 :
// 1 
// 5
// Sample Output2 :
// 1 2 3 4 5 
// 11 12 13 14 15 
// 21 22 23 24 25 
// 16 17 18 19 20 
// 6 7 8 9 10 
// Explanation of Sample Input 1:
// For test case 1:
// We print the given pattern for the given 5 rows where each row has different values in increasing order with a difference in the value of 1 between each element and 1 space between each column in a row.
// Sample Input2 :
// 1
// 4
// Sample Output2 :
// 1 2 3 4
// 9 10 11 12
// 13 14 15 16
// 5 6 7 8
// Explanation of Sample Input 2:
// For test case 1:
// We print the given pattern for the given 4 rows where each row has different values in increasing order with a difference of 1 in the value of 1 between each element and 1 space between each column in a row.

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    public String[] NumberPattern(int n) {
        int i = 0, j = n - 1;
        String[] ans = new String[n];
        int count = 1;
        boolean iOrj = true;

        while (i <= j) {
            StringBuilder temp = new StringBuilder();

            if (i == j) {
                for (int x = 0; x < n; x++) {
                    temp.append(count++);
                    if (x != n - 1)
                        temp.append(" ");
                }
                ans[i] = temp.toString();
                i++;
            } else {
                for (int x = 0; x < n; x++) {
                    temp.append(count++);
                    temp.append(" ");
                }
                if (iOrj) {
                    ans[i] = temp.toString();
                    i++;
                } else {
                    ans[j] = temp.toString();
                    j--;
                }
                iOrj = !iOrj;
            }
        }
        return ans;
    }
}
public class Main
{
	 public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.NumberPattern(5);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

