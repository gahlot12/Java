public class ReverseWordInAStringQ7 {
    public static void reverse(char s[], int start, int end) {
        char temp;
        while (start < end) {
            temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }

    public static char[] reverseWords(char s[]) {
        int start = 0;
        for (int end = 0; end < s.length; end++) {
            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }
        }
        // Reverse the last word
        reverse(s, start, s.length - 1);
        // Reverse the entire string
        reverse(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args) {
        String s = "i like this program very much ";
        char[] p = reverseWords(s.toCharArray());
        System.out.print(p);
    }
}
