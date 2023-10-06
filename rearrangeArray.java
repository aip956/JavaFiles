/* https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/description/
 * 
 * Take 1/2 values of array: 1 _ 2 _ 3, then put remaining nums in remaining slots
 * 1 _ 4 _ 2 _ 5 _ 3; each num is surrounded by nums higher or lower so wont be average
 * sort array
 * res = []
 * while length or result != result;
 * l, r = 0; len(nums) - 1
 * 
 */
import java.util.*;
public class rearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int[] result = {};
        int left = 0; 
        int right = 0;
        int length = nums.length;
        ArrayList<Integer> numsArr = new ArrayList<>();
        
        for (int num : nums) {
            numsArr.add(num);
        }
        System.out.println("23numsArr: " + numsArr);
        Collections.sort(numsArr);
        for (int i = 0; i < length; i++) {
            result[left] = numsArr[i];
            result[right]
        }
            
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        System.out.println("Output1: " + rearrangeArray(nums1));

        // int[] nums2 = {6,2,0,9,7};
        // System.out.println("Output2: " + rearrangeArray(nums2));
    }
}
