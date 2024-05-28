// Sum of all divisors from 1 to n

// Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

// Example 1:

// Input:
// N = 4
// Output:
// 15
// Explanation:
// F(1) = 1
// F(2) = 1 + 2 = 3
// F(3) = 1 + 3 = 4
// F(4) = 1 + 2 + 4 = 7
// ans = F(1) + F(2) + F(3) + F(4)
//     = 1 + 3 + 4 + 7
//     = 15


/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    public long sumOfDivisors(int n) {
        long sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += (n / i) * i;
        }
        return sum;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution solution = new Solution();
        
        int n = 10;
        long result = solution.sumOfDivisors(n);
        
        System.out.println("Sum of divisors of " + n + " is: " + result);
	}
}
