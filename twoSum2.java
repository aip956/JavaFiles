import java.util.*;
/*
Given an array of integers nums and an integer 
target, return indices of the two numbers such 
that they add up to target.
You may assume that each input would have exactly
 one solution, and you may not use the same 
 element twice.

You can return the answer in any order.

Sort the array
While 
Use left and right pointers
If the sum is == target, return left, right
If the sum is < target, move left pointer +1
If the sum is > target, move right pointer -1
 */
public class twoSum2 {
    public static int[] twoSum(int[] nums, int target) {
    int left_ind = 0;
    int right_ind = nums.length - 1;
    Arrays.sort(nums);
    while (left_ind < right_ind) {

        int sum = nums[left_ind] + nums[right_ind];
        if (sum == target) {
            return new int[] {left_ind, right_ind};
        }
        else if (sum < target) {
            left_ind++;
        }
        else {
            right_ind--;
        }
    }
    return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 17;
        int[] output1 = twoSum(nums1, target1);
        System.out.println(Arrays.toString(output1));
    }
}
// doesn't work; need to return the indices of the original array
// without sorting