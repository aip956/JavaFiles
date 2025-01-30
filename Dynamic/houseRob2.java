import java.util.Arrays;

class houseRob2 {
    public static int rob(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;
        if (nums.length == 1) return nums[0];
        // get max loot of 1 - second to last
        // another max of last to second
        // max of those

        // create arrays of skipLast and skipFirst
        int[] skipLast = new int[nums.length-1];
        int[] skipFirst = new int[nums.length-1];

        for (int i = 0; i < nums.length - 1; i++) {
            skipLast[i] = nums[i];
            skipFirst[i] = nums[i+1];
        }
        System.out.println("skipLast: " + Arrays.toString(skipLast));
        System.out.println("skipFirst: " + Arrays.toString(skipFirst));

        // Get loot from both
        int lootSkipLast = robHelper(skipLast);
        int lootSkipFirst = robHelper(skipFirst);
        
        return Math.max(lootSkipLast, lootSkipFirst);
    }

    private static int robHelper(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        // int[] nums1 = {2, 3, 2};
        // System.out.println(rob(nums1));
        // System.out.println();
        // int[] nums2 = {1, 2, 3, 1};
        // System.out.println(rob(nums2));
        // System.out.println();
        int[] nums3 = {2, 7, 3, 1, 4, 2, 1, 8};
        System.out.println(rob(nums3));
    }
}

/*
 Can't rob first and last houses
 https://leetcode.com/problems/house-robber-ii/description/
 You are a professional robber planning to rob houses along 
 a street. Each house has a certain amount of money stashed. 
 All houses at this place are arranged in a circle. That means 
 the first house is the neighbor of the last one. Meanwhile, 
 adjacent houses have a security system connected, and it will 
 automatically contact the police if two adjacent houses were 
 broken into on the same night.

Given an integer array nums representing the amount of money 
of each house, return the maximum amount of money you can rob 
tonight without alerting the police.
 */