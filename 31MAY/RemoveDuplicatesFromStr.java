public class RemoveDuplicatesFromStr {
    public static void main(String[] args) {
        String str = "learnjavafrombasics";
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                str2 += ch;
            }
        }
        System.out.println("String before removing duplicates : " + str);
        System.out.println("String after removing duplicates : " + str2);
    }
}
