class houseRobber {
    public static int rob(int[] nums) {
        /*
         * total loot of n-2 + n, vs. n-1; nums=2,7,9,3,1
         * total array: [2, 7, ]
         */
        // without the whole array [p2, p1, max(num+p2, p1)] -> [p2,temp=p1]
        if (nums.length < 2 || nums == null) return nums[0];
        if (nums.length == 1) return nums[0];
        int prev2 = 0; // dp[i-2]
        int prev1 = 0;
        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + num);
            prev2 = temp;
        }

    return prev1;
        // int[] dp = new int[nums.length];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        
        // for (int i = 2; i < nums.length; i++) {
        //     dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);

        //     System.out.println("i: " + i);
        //     System.out.println("nums[i]: " + nums[i]);
        //     System.out.println("dp_i2: " + dp[i-2]);
        //     System.out.println("dp_i1: " + dp[i-1]);
        //     System.out.println("dp_i: " + dp[i]);

        // }
        // return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        /*
        n_2 = 2; n_1 = 7
        i=2, total = max(9+2, 7) = 11, n_2 = n_1, n_1=nums[i-1]
        i=3, total = max()
        */
        System.out.println(rob(nums));
        System.out.println();
        int[] nums1 = {2,0,0,10,1};
        System.out.println(rob(nums1));
    }
}

/*
 * https://leetcode.com/problems/house-robber/
 * You are a professional robber planning to rob houses 
 * along a street. Each house has a certain amount of 
 * money stashed, the only constraint stopping you from 
 * robbing each of them is that adjacent houses have 
 * security systems connected and it will automatically 
 * contact the police if two adjacent houses were broken 
 * into on the same night.

Given an integer array nums representing the amount of 
money of each house, return the maximum amount of money 
you can rob tonight without alerting the police.

 

Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.

[1,0,0,5]
 */