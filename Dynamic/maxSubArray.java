
class maxSubArray {
    public static int maxSubArray(int[] nums) {
        // {-2,1,-3,4,-1,2,1,-5,4}
        /* mL[0] = -2, 
        mL[1]= 1 or -1 = 1, mG=1
        mL[2] = -3 or (-3 + 1) = -2, mG=-1
        mL[3]= 4 or (-2 + 4) = 4, mG=4

        i   0   1   2   3   4   5   6  7  8  
        L   -2  1   -2  4   3   5   6  1  5 
        G   -2  1   1   4   4   5   6  6  6 

         * 
         */
        // for right ind, max subarr = max of num[i] vs. num[i-1]
        int maxGlob = nums[0];
        int maxLoc = nums[0];
        System.out.println("Loc: " + maxLoc + " , Glob: " + maxGlob);
        for (int i = 1; i < nums.length; i++) {
            System.out.println("i: " + i);
            System.out.println("nums[i]: " + nums[i]);
            maxLoc = Math.max(nums[i], nums[i]+maxLoc);
            System.out.println("maxLoc: " + maxLoc);
            maxGlob = Math.max(maxLoc, maxGlob);
            System.out.println("maxGlob: " + maxGlob);
        }
        return maxGlob;
    }


    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}