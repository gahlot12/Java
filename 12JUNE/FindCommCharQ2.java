// Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

// Example 1:

// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]
// Example 2:

// Input: words = ["cool","lock","cook"]
// Output: ["c","o"]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommCharQ2 {
    public static List<String> commonChars(String[] words) {
        int size = words.length;
        int commonCharacterCount[] = new int[26];
        int currentCharacterCount[] = new int[26];
        List<String> ans = new ArrayList<>();

        for(char ch : words[0].toCharArray()){
            commonCharacterCount[ch-'a']++;
        }

        for(int i = 1;i<size;i++){
            Arrays.fill(currentCharacterCount,0);

            for(char ch : words[i].toCharArray()){
                currentCharacterCount[ch-'a']++;
            }

            for(int letter = 0;letter<26;letter++){
                commonCharacterCount[letter] = Math.min(commonCharacterCount[letter],currentCharacterCount[letter]);
            }
        }

        for (int letter = 0; letter < 26; letter++) {
            for (
                int commonCount = 0;
                commonCount < commonCharacterCount[letter];
                commonCount++
            ) {
                ans.add(String.valueOf((char) (letter + 'a')));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String words[] = {"bella","label","roller"};
        List<String> c1 = new ArrayList<>();
        c1 = commonChars(words);
        for (String string : c1) {
            System.out.print(string + " ");
        }
    }
}

