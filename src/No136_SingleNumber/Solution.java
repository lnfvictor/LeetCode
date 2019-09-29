package No136_SingleNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1};
//        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + singleNumber(nums));
    }

    // using XOR
//    public static int singleNumber(int[] nums) {
//        int result = 0;
//        for(int i = 0; i < nums.length; i++){
//            result ^= nums[i];
//        }
//        return result;
//    }

    // using HashMap
    public static int singleNumber(int[] nums){
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
                if(!hs.remove(nums[i]))
                    hs.add(nums[i]);
        }
        return (int)hs.toArray()[0];
    }
}