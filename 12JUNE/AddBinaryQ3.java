public class AddBinaryQ3 {
    public static String addBinary(String a, String b) {
        int carry = 0;
        String ans = "";
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit_a;
            if(i>=0){
                digit_a = a.charAt(i--) - '0';
            }
            else{
                digit_a = 0;
            }
            int digit_b;
            if(j>=0){
                digit_b = b.charAt(j--) - '0';
            }
            else{
                digit_b = 0;
            }
            int sum = digit_a + digit_b + carry;
            carry = sum / 2;
            int digit = sum % 2;
            ans = Integer.toString(digit) + ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        String a = "1101";
        String b = "101";
        System.out.println(addBinary(a, b));
    }
}
