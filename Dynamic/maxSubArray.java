
class maxSubArray {
    public static int maxSubArray(int[] nums) {
        // {-2,1,-3,4,-1,2,1,-5,4}
        // for right ind, max subarr = max of num[i] vs. num[i-1]
        int maxGlob = nums[0];
        int maxLoc = nums[0];
        for (int i = 1; i < nums.length; i++) {
            
        }

        return 0;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}