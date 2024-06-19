// Sum of Square Numbers
// Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c. 

// Example 1:

// Input: c = 5
// Output: true
// Explanation: 1 * 1 + 2 * 2 = 5
// Example 2:

// Input: c = 3
// Output: false

public class Q1 {
    public static boolean judgeSquareSum(int c) {
        if(c<0)return false;
        long i = 1;
        long j = (long)Math.sqrt(c);
        if(j*j == c) return true;
        while(i<=j){
            long sum = (i*i + j*j);
            if(sum==c)return true;
            else if(sum<c)i++;
            else j--;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(judgeSquareSum(4));
    }
}