import java.util.*;

public class containsDup {
    public static boolean containsDuplicate(int[] nums) {
        HashSet <Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        System.out.println("9numsSet: " + numsSet);
        System.out.println("10numslen: " + nums.length);
        System.out.println("11setsize: " + numsSet.size());
        return (nums.length != numsSet.size());
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println("Output1: " + containsDuplicate(nums1));
        int[] nums2 = {1,2,3,4};
        System.out.println("Output1: " + containsDuplicate(nums2));
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("Output1: " + containsDuplicate(nums3));
    }
}



/*
 * https://leetcode.com/problems/contains-duplicate/description/
 * Given an integer array nums, return true if any value 
 * appears at least twice in the array, and return false 
 * if every element is distinct.

 create a set
 is length of nums = size of set

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */