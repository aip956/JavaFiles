/* https://leetcode.com/problems/product-of-array-except-self/


*/
import java.util.*;
public class prodExcSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            System.out.println("i: " + i);
            System.out.println("result[i]: " + result[i]);
            prefix *= nums[i];
            System.out.println("prefix: " + prefix);
            System.out.println("Preresult: " + Arrays.toString(result));
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= postfix;
            System.out.println("i: " + i);
            System.out.println("result[i]: " + result[i]);
            System.out.println("postfix: " + postfix);
            postfix *= nums[i];
            System.out.println("Postreult: " + Arrays.toString(result));

        }
        System.out.println("result: " + Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Output: " + Arrays.toString(productExceptSelf(nums1)));
        int[] nums2 = {-1,1,0,-3,3};
        System.out.println("Output: " + Arrays.toString(productExceptSelf(nums2)));
    }
}
