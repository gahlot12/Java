// Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321


class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        } 
        return (int) rev;
    }
}
public class Main
{
	public static void main(String[] args) {
		Solution solution = new Solution();
        
        // Example usage of the reverse method
        int num = 123; // You can change the value of num as needed
        int reversed = solution.reverse(num);
        
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
	}
}
