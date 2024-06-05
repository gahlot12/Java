//given string is anagram or not


public class Ques2 {

    public static boolean checkIfPangram(String sentence) {

        // if(sentence.length()<26)return false;
        // int count = 0;
        // for(char ch = 'a';ch<='z';ch++){
        //     if(sentence.indexOf(ch)!=-1)count++;
        // }
        // if(count != 26)return false;
        // return true;

        
        boolean flag[] = new boolean[26];
        int n = sentence.length();
        for(int i = 0;i<n;i++){
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                flag[ch - 'a'] = true;
            }
            else if (ch >= 'A' && ch <= 'Z'){
                flag[ch - 'A'] = true;
                }
        }
        for(int i = 0;i<26;i++){
            if(flag[i]==false)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        if (checkIfPangram(s)) {
            System.out.println("The given sentence is a Panagram");
        }
        else{
            System.out.println("The given sentence is not a Panagram");
        }
    }
}
