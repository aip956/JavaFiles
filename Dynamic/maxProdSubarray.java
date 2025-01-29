import java.util.*;
class maxProdSubarray {
    public static int maxProduct(int[] nums) {
        int maxLoc = nums[0];
        int minLoc = nums[0];
        int maxGlob = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == 0) {
                minLoc = 0;
                maxLoc = 0;
                maxGlob = Math.max(0, maxGlob);
            }
            else {
                int temp = maxLoc;
                maxLoc = Math.max(nums[i], Math.max(maxLoc * nums[i], minLoc * nums[i]));
                minLoc = Math.min(nums[i], Math.min(temp * nums[i], minLoc * nums[i]));
                maxGlob = Math.max(maxLoc, maxGlob);
            }
        }
        return maxGlob;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
        int[] nums1 = {-2,0,-1};
        System.out.println(maxProduct(nums1));
        int[] nums2 = {2, 3, -2, 4, -1};
        System.out.println(maxProduct(nums2));
    }
}

/*
track min too
    {2, 3, -2,  4,  -1}
i     0   1   2   3   4 
mxL   2   6   -2  4   -1  
mnL    
mxG   2   6   6   6        


 * https://leetcode.com/problems/maximum-product-subarray/description/
 * Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.
 */