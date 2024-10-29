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
        answer[3] = answer[3] * suffix = 6 * 1 = 6
        suffix *= nums[3] = 1 * 4 = 4
        answer[2] = answer[2] * suffix = 2 * 4 = 8
        suffix *= nums[2] = 4 * 3 = 12
        answer[1] = answer[1] * suffix = 1 * 12 = 12
        suffix *= nums[1] = 12 * 2 = 24
        answer[0] = answer[0] * suffix = 1 * 24 = 24
        answer = [24, 12, 8, 6]
        */
        int n = nums.length;
        int[] answer = new int[n];

        // Prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;

        // int[] result = new int[nums.length];
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
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Output: " + Arrays.toString(productExceptSelf(nums1)));
        // int[] nums2 = {-1,1,0,-3,3};
        // System.out.println("Output: " + Arrays.toString(productExceptSelf(nums2)));
    }
}
