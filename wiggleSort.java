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
        ArrayList<Integer> numsArr = new ArrayList<>();


        // copy nums into numsArray
        for (int num : nums) {
            numsArr.add(num);
        }

        Collections.sort(numsArr);
        System.out.println("16numsArr: " + numsArr);

        int length = nums.length;
        int i = 0;
        int left = 0;
        int right =(int) (Math.ceil((double) length / 2));
        System.out.println("21right: " + right);

        while (i < length) {
            nums[i] = numsArr.get(left);
            System.out.println("i: " + i + ", nums[i]: " + nums[i])
            if (right < length) {
                nums[i + 1] = numsArr.get(right);
                System.out.println("i+1: " + (i+1) + ", nums[i+1]: " + nums[i+1]);
                right ++;
            }
            left++;
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1,5,1,1,6,4};
        wiggleSort(nums1);
        // System.out.println("Output: " + wiggleSort(nums1));
        // int[] nums2 = {1,3,2,2,3,1};
        // System.out.println("Output2: " + wiggleSort(nums2));
    }
}
