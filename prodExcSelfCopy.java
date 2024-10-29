import java.util.*;
public class prodExcSelfCopy {
    public static int[] productExceptSelf(int[] nums) {
        /* Create answer array to store products
        Pre-fix products: Get cummul product up to each element
        Suffix products: From end, get cummul prod
        then mult the suffix prod for each i
        nums = [1, 2, 3, 4]
        answer[0] = 1
        answer[1] = nums[0] = 1
        answer[2] = nums[0] * nums[1] = 1 * 2 = 2
        answer[3] = nums[0] * nums[1] * nums[2] = 1 * 2 * 3 = 6
        answer = [1, 1, 2, 6]
        suffix = 1
        answer [3] = answer[3] * suffix = 6 * 1 = 6
        suffix *= nums[3] = 1 * 4 = 4
        





        */







        int[] result = new int[nums.length];
        // int pre = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     result[i] = pre;
        //     pre *= nums[i];
        //     System.out.println("9pre: " + Arrays.toString(result));
        // }
        // int post = 1;
        // for (int i = nums.length-1; i >= 0; i--) {
        //     result[i] *= post;
        //     post *= nums[i];
        //     System.out.println("15post: " + Arrays.toString(result));
        // }
    
        // return result;
        
    }

    public static void main(String[] args) {
        // int[] nums1 = {2, 3, 4, 5, 6};
        // System.out.println("Output: " + Arrays.toString(productExceptSelf(nums1)));
        int[] nums2 = {-1,1,0,-3,3};
        System.out.println("Output: " + Arrays.toString(productExceptSelf(nums2)));
    }
}
