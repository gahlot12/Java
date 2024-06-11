
// #include <iostream>
// #include <unordered_set>
// using namespace std;

// int main()
// {
//     string s = "pwrpabcabbadeafgp";
//     int maxLenSubStr = 0;
//     for(int i=0;i<s.size();i++){
//         unordered_set<char> seen;
//         int len = 0;
//         for(int j = i;j<s.size();j++){
//             if(seen.count(s[j])) break;
//             else{
//                 seen.insert(s[j]);
//                 len++;
//             }
//         }
//         maxLenSubStr = max(maxLenSubStr,len);
//     }
//     cout<<maxLenSubStr<<endl;

//     return 0;
// }

import java.util.HashSet;
import java.util.Set;

public class MaxLenSubArrQ5 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i = 0;i<n;i++){
            Set<Character> seen = new HashSet<>();
            int len = 0;
            for(int j = i;j<n;j++){
                if(seen.contains(s.charAt(j)))break;
                else{
                    len++;
                    seen.add(s.charAt(j));
                }
            }
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        MaxLenSubArrQ5 solution = new MaxLenSubArrQ5();
        String s = "pwrpabcabbadeafgp";
        int maxLenSubStr = solution.lengthOfLongestSubstring(s);
        System.out.println("Maximum length of substring with distinct characters: " + maxLenSubStr);
    }
}
