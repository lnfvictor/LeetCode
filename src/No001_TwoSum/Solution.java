package No001_TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target  = 9;
        System.out.println("Input: " + Arrays.toString(nums) + ", Target: " + target);
        System.out.println("Output: " + Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int left = target - nums[i];
            if(hashMap.containsKey(left)){
                result[0] = hashMap.get(left);
                result[1] = i;
                return result;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
