class prodExcSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix =  1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        
        return result;
    }


    public static void main(String[] args) {
        int nums = {1, 2, 3, 4};
        result = productExceptSelf(nums);
        System.out.println("Result: " + result);
    }
}

/*
 * [1, 2, 3, 4], from left: 
 * pre: 1, 1*1, 1*2, 
 */