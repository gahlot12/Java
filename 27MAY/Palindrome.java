/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Palindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
public class Main
{
	public static void main(String[] args) {
		Palindrome palindromeChecker = new Palindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = palindromeChecker.isPalindrome(s);
        System.out.println("Is \"" + s + "\" a palindrome? " + result);
	}
}
