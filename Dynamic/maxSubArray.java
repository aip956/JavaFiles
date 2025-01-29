
class maxSubArray {
    public static int maxSubArray(int[] nums) {
        // {-2,1,-3,4,-1,2,1,-5,4}
        /* mL[0] = -2, mL[1]= 1 or -1 = 1
        mL[2] = -3 or (-3 + 1), mG=-2
        mL[3]= 4 or (-2 + 4) = 4, mG=4
         * 
         */
        // for right ind, max subarr = max of num[i] vs. num[i-1]
        int maxGlob = nums[0];
        int maxLoc = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxLoc = Math.max(nums[i], maxLoc);
            maxGlob = Math.max(maxLoc, maxGlob);
        }

        return maxGlob;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}