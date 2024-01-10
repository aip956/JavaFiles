import java.util.*;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
/* {2,7,11,15}; target = 9
create an array
 * for length of array
 * complement = target - num[i]; comp = 7 for nums[0] = 2
 * is comp in array? 7, i
 * if no, put it there
 * for each nums[i], is comp in array? if so return i and key of comp
 * 
 */


        Map<Integer, Integer> compHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            System.out.println("Compl: " + compliment);
            if (compHash.containsKey(compliment)) {
                return new int[] {compHash.get(compliment), i};
            } else {
                compHash.put(nums[i], i);
            }
            System.out.println("Hash: " + compHash);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.print("Output1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

// https://leetcode.com/problems/two-sum/description/?submissionId=991887337
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

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
 */
        // iterate through nums
        // for each element, is the compliment in a hash
        // if not put it index, compliment
        // round 1: ind = 0, num[i] = 2, compl = 7; add to hash: {2, 0} or num[i],i
        // round 2: ind = 1, num[i] = 7, compl = 2; add to hash: {2, 0}