import java.util.*;
public class prodExcSelfCopy {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int pre = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre;
            pre *= nums[i];
            System.out.println("9pre: " + Arrays.toString(result));
        }
        int post = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            result[i] *= post;
            post *= nums[i];
            System.out.println("15post: " + Arrays.toString(result));
        }
    
        return result;
        
    }

    public static void main(String[] args) {
        // int[] nums1 = {2, 3, 4, 5, 6};
        // System.out.println("Output: " + Arrays.toString(productExceptSelf(nums1)));
        int[] nums2 = {-1,1,0,-3,3};
        System.out.println("Output: " + Arrays.toString(productExceptSelf(nums2)));
    }
}
