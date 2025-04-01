import java.util.*;

class rotateArray {
    public static void rotate(int[] nums, int k) {
        // reverse array {7, 6, 5, 4, 3, 2, 1} => 5, 6, 7, 1, 2, 3, 4
        k = k % n;
        int length = nums.length;
        // swap 0 - (k-1)
        for (int i = 0; i <= k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k-1];
            nums[k-1] = temp;
        }
        System.out.println(Arrays.toString(nums));
        // swap 
        for (i = k; i <= length; i++) {
            int temp = nums[i];
            nums[i] = nums[length - 1];
            nums[length - 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        k1 = 3;
        System.out.println(rotate(nums1, k1));

    }
}







/*
 * Given an integer array nums, rotate the array to the 
 * right by k steps, where k is non-negative.

Example 1:
if k = 10, k % n = 3
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */