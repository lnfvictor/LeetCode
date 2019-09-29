package No162_FindPeakElement;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3, 1};
//        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
//        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 4};
        int[] nums = new int[]{1, 2, 3, 9, 5, 6, 7, 8, 4};
//        int[] nums = new int[]{1};
//        int[] nums = new int[]{3, 2};
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + findPeakElement(nums));
    }

    // Binary Search
//    public static int findPeakElement(int[] nums){
//        if(nums.length == 1)
//            return 0;
//        if(nums[0] > nums[1])
//            return 0;
//        if(nums[nums.length - 1] > nums[nums.length - 2])
//            return nums.length - 1;
//
//        return findPeakElementIgnoreBothEnds(nums);
//    }
//
//    public static int findPeakElementIgnoreBothEnds(int[] nums){
//        if(nums.length < 3)
//            return -1;
//
//        int mid = nums.length / 2;
//        if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
//            return mid;
//
//        int[] leftArr = Arrays.copyOfRange(nums, 0, mid + 1);
//        int leftResult = findPeakElementIgnoreBothEnds(leftArr);
//        if(leftResult != -1)
//            return leftResult;
//
//        int[] rightArr= Arrays.copyOfRange(nums, mid, nums.length);
//        int rightResult = findPeakElementIgnoreBothEnds(rightArr);
//        if(rightResult != -1)
//            return rightResult + mid;
//
//        return -1;
//    }

    public static int findPeakElement(int[] nums){
        int p = 0;
        int q = nums.length - 1;
        while(p < q){
            int mid = (p + q) / 2;
            if(nums[mid] > nums[mid + 1]){
                q = mid;
            } else {
                p = mid + 1;
            }
        }
        return p;
    }
}