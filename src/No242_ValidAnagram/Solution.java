package No242_ValidAnagram;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "car";
        System.out.println("Input: s = " + s + ", t = " + t);
        System.out.println("Output: " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < sArr.length; i++){
            if(hashMap.containsKey(sArr[i]))
                hashMap.put(sArr[i], hashMap.get(sArr[i]) + 1);
            else
                hashMap.put(sArr[i], 1);
        }

        for(int i = 0; i < tArr.length; i++){
            if(hashMap.containsKey(tArr[i]))
                hashMap.put(tArr[i], hashMap.get(tArr[i]) - 1);
            else
                return false;
        }

        for(Character key : hashMap.keySet()){
            if(hashMap.get(key) != 0)
                return false;
        }
        return true;
    }
}
