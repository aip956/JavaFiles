import java.util.Arrays;

class prodExcSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix =  1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] output = productExceptSelf(nums);
        System.out.println("Result: " + Arrays.toString(output));
    }
}

/*
 * [1, 2, 3, 4], from left: 
 * pre: 1, 1*1, 1*2, 
 */