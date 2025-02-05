/* given array of integers, find the subarray with greatest sum
return subarray {-2,1,-3,4,-1,2,1,-5,4}; // 4,-1,2,1; s=3, e=6, l=4
mLoc, mGl, start, end
mLoc = n, n + mLoc; mGl = mLoc, mGl
start = n > n + mLoc; start = i; end = mLoc > old Gl
*/
import java.util.Arrays;
public class int5 {
    public static int[] result (int[] arr) {
        int mLoc = arr[0];
        int mGl = arr[0];
        int start_i = 0;
        int end_i = 0;

        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            int old_Gl = mGl;
            if (n > n + mLoc) start_i = i;
            mLoc = Math.max(n, n + mLoc);
            mGl = Math.max(mLoc, mGl);
            if (mLoc > old_Gl) end_i = i;
        }
        // 4,-1,2,1, st=3, end=6; l=4
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
        int[] output = result(arr);
        System.out.println("output: " + Arrays.toString(output));
    }
}