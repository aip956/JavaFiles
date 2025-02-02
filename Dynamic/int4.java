/*
given array of integers, find the subarray with greatest sum
return subarray {-2,1,-3,4,-1,2,1,-5,4}; => {4,-1,2,1}
 */

public class int4 {
    public static int[] findMaxSub(int[] arr) {
        if (arr == null || arr.length < 1) return null;
        int mLoc = arr[0], mGl=arr[0];
        int start_i = 0, end_i = 0;
        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            int old_Gl = mGl;
            if (n > n + mLoc) start_i = i;
            mLoc = Math.max(n, n + mLoc);
            mGl = Math.max (mLoc, mGl);
            if (mLoc > old_Gl) end_i = i;
        }
        // make the subarry
        int len = end_i - start_i + 1;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = arr[start_i];
            start_i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] output = findMaxSub(arr);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }


}