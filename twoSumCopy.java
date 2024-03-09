import java.util.Arrays;
import java.util.HashMap;

public class twoSumCopy {
    public static int[] twoSum(int[] nums, int target) {
        
      HashMap<Integer, Integer> compHash = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
        int comp = target - nums[i];
        if (compHash.containsKey(comp)) {
            return new int[] {i, compHash.get(comp)};
        }
        else {
            compHash.put(nums[i], i);
            System.out.println("14compHash: " + compHash);
        }
      }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 17;
        int[] output1 = twoSum(nums1, target1);
        System.out.println("Output1: " + Arrays.toString(output1));
    }
}

/*
for each element, determine compliment
search or add to hash the index, compliment

try: {2,7,11,15}, target 17
Hash: {2, 0} {7, 1} {11, 2} at 15, will find compl 2, will return 
index of 15 = 3
index of 2 = 0
 * https://leetcode.com/problems/two-sum/description/
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add 
 * up to target.
 * 
 * You may assume that each input would have exactly 
 * one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 * 
 */