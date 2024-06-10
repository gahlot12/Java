// 58. Length of Last Word
// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal 
// substring
//  consisting of non-space characters only.

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

public class Ques3 {

    public static int lengthOfLastWord(String s) {
        int n = s.length()-1;
        while(n >= 0 && s.charAt(n) == ' '){
            n--;
        }
        int pos = 0;
        int i = n;
        
        while(i>=0 && s.charAt(i)!= ' '){
            pos++;
            i--;
        }
        return pos;
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        String s1 = "   fly me   to   the moon  ";

        System.out.println("The last word in the string s is : " + lengthOfLastWord(s));
        System.out.println("The last word in the string s1 is : " + lengthOfLastWord(s1));
    }
}
