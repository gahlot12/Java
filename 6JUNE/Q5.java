public class Q5 {
    public static void main(String[] args) {
        String s[] = {"yuji", "itadori", "gojo", "sataru", "makima", "hinata", "nami", "robin"};
        int n = s.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (s[j].compareTo(s[j + 1]) > 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        for (String string : s) {
            System.out.println(string);
        }
    }
}
