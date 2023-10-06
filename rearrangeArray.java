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
        int[] result = new int[nums.length];

        int right = 0;
        int length = nums.length;
        int left = (int) (Math.ceil((double) length / 2));
        System.out.println("left: " + left);

        ArrayList<Integer> numsArr = new ArrayList<>();
        
        for (int num : nums) {
            numsArr.add(num);
        }
        Collections.sort(numsArr);
        System.out.println("23numsArr: " + numsArr);
        
        int i = 0;
        while ( i < length) {
            result[i] = numsArr.get(right);
            System.out.println("31result[i]: " + result[i]);
            if (left < length) {
                result[i + 1] = numsArr.get(left);
                System.out.println("31result[i+1]: " + result[i+1]);
                left++;
            }
            right++;
            i+=2;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums1 = {1,2,3,4,5,6};
        // System.out.println("Output1: " + rearrangeArray(nums1));

        int[] nums2 = {6,2,0,9,7};
        System.out.println("Output2: " + rearrangeArray(nums2));
    }
}
