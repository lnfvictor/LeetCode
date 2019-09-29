package No003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
//        String s = "abcabcbb";
        String s = "bbbbb";
//        String s = "pwwkew";
        System.out.println("Input: " + s);
        System.out.println("Output: " + lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        while(left < s.length() && right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return result;
    }
}
