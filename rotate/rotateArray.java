import java.util.*;

class rotateArray {
    public static void rotate(int[] nums, int k) {
        // reverse array {7, 6, 5, 4, 3, 2, 1} => 5, 6, 7, 1, 2, 3, 4
        int n = nums.length;
        k = k % n;
        System.out.println("n: " + n);
        System.out.println("k: " + k);
        // reverse the string
        reverse(nums, 0, n - 1);
        System.out.println("Reverse: " + Arrays.toString(nums));

        // swap 0 - (k-1)
        reverse(nums, 0, k - 1);
        System.out.println("Part1: " + Arrays.toString(nums));

        // swap part2; k and length-1;; 3, 6
        reverse(nums, k, n - 1);
        System.out.println("Part2: " + Arrays.toString(nums));
        }
    
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];//1
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println(Arrays.toString(nums1));
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