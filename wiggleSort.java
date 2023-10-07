/*
 * https://leetcode.com/problems/wiggle-sort-ii/
 * 1. Copy into arrayLIst
 * 2. Sort
 * 3. Split array in half, left and right
 * 4. New array alternates between left and right
 */

import java.util.*;
public class wiggleSort {
    public static void wiggleSort(int[] nums) {
        // nums.sort((a, b) => a - b);
        ArrayList<Integer> numsArr = new ArrayList<>();


        // copy nums into numsArray
        for (int num : nums) {
            numsArr.add(num);
        }

        Collections.sort(numsArr, Collections.reverseOrder());
        System.out.println("16numsArr " + numsArr);

        int length = nums.length;
        int i = 0;
        int left = 0;
        int right = length / 2;
        System.out.println("21right: " + right);

        while (i < length) {
            if (right < length) {
                nums[i] = numsArr.get(right);
                System.out.println("i: " + i + ", nums[i]: " + nums[i]);
                right ++;
            }
            nums[i + 1] = numsArr.get(left);
            System.out.println("i+1: " + (i+1) + ", nums[i+1]: " + nums[i+1]);
            left++;
            i += 2;
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,5,1,1,6,4,7};
        wiggleSort(nums1);
        
        // int[] nums2 = {1,3,2,2,3,1};
        // wiggleSort(nums2);

        // int[] nums3 = {4,5,5,6};
        // wiggleSort(nums3);
        
    }
}
