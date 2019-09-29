package No011_ContainerWithMostWater;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Input: " + Arrays.toString(height));
        System.out.println("Output: " + maxArea(height));
    }

    // Two Pointers
    public static int maxArea(int[] height){
        int str = 0;
        int end = height.length - 1;
        int max = 0;
        while(str < end){
            max = Math.max(max,
                    Math.min(height[str], height[end]) * (end - str));
            if (height[str] < height[end]) {
                str++;
            } else {
                end--;
            }
        }
        return max;
    }
}