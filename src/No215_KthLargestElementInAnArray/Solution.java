package No215_KthLargestElementInAnArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 4;
        System.out.println("Input: " + Arrays.toString(nums) + ", K= "+ k);
        System.out.println("Output: " + findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        int kthSmallest = nums.length - k + 1;
        return findKthSmallest(nums, 0, nums.length - 1, kthSmallest);
    }

    public static int findKthSmallest(int[] nums, int low, int high, int k){
        if(low >= high)
            return nums[k - 1];

        int l = low;
        int h = high;
        int base = high; // can choose any one as base, in this case, just choose the last element
        while(l < h){
            while(nums[l] <= nums[base] && l < h)
                l++;
            while(nums[h] >= nums[base] && l < h)
                h--;
            swap(nums, l, h);
        }
        swap(nums, l, base);
        if (l == (k - 1))
            return nums[l];
        else if (l < (k - 1))
            return findKthSmallest(nums, l + 1, high, k);
        else
            return findKthSmallest(nums, low, l - 1, k);
    }

    public static final void swap(int[] nums, int p, int q){
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}
