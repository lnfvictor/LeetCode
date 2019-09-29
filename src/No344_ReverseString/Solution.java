package No344_ReverseString;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("Input: " + Arrays.toString(s));
        reverseString(s);
        System.out.println("Output: " + Arrays.toString(s));
    }

    public static void reverseString(char[] s){
        int p = 0;
        int q = s.length - 1;
        while(p < q){
            swap(s, p, q);
            p++;
            q--;
        }
    }

    public static final void swap(char[] nums, int p, int q){
        char temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}
