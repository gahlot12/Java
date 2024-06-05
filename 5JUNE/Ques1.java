//given the string aaaaabbbcc return 5a3b2c

import java.util.HashMap;
import java.util.Map;

public class Ques1 {
    public static void main(String[] args) {
        String s = "aaaaabbbcac";
        Map<Character,Integer> mp = new HashMap<>();

        for(char ch : s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.print(entry.getValue());
            System.out.print(entry.getKey());
        }
    }
}
