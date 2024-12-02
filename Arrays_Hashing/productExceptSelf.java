import java.util.*;

public class productExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println("Postfix: " + postfix);
            System.out.println("i: " + i);
            System.out.println("nums[i]: " + nums[i]);
            System.out.println("result: " + Arrays.toString(result));
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] output = productExceptSelf(nums);
        System.out.println(Arrays.toString(output));
    }
}

/*
 * multiply values before and after element
 * prefix: mult from left
 * postfix: mult from right
 * for each elem, mult pref i-1, post of i+1
 * store prefix, then mult by post
 * nums: {1, 2, 3, 4}
 * pref result: 1, 1*1, 1*2, 1*2*3=6
 * post result: 24*1, 1*12, 4*2, 1*6
 * 
 * 
 */