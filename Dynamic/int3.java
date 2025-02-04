/* given array of integers, find the subarray with greatest sum
return subarray {-2,1,-3,4,-1,2,1,-5,4}; // 4,-1,2,1; s=3, e=6, l=4
mLoc: n vs. n+mLoc
mGl: mLoc vs. mGl
start_i: n > n+mLoc
end_i: mL > old mG
i=0,n=-2, mL:-2v(-2+0)=-2, mG:-2, s:0
i=1,n=1, mL:1 v (-2+1)=1, mG:1, s:1
i=2,n=-3, mL:-3 v(-3+1)=-2, mG:1,s:1,e:1
i=3,n=4, mL:4 v (-3+4)=4, mG:4; s:2s: n>n+mL; n became positive and greater than the preceding max Local
i=4,n=-1, mL:-1 v (-1+4)=3, mG:4; not end; n decreased the mLoc
i=5,n=2, mL:2 v (2+3)=5, mG:5, end: mL > old mG; n increased mL and mG
i=6,n=1, mL:1 v (1+5)=6, mG:6; end: mL > old mG; n increased mL and mG
i=7,n=-5, mL:-5 v (-5+6)=1, mG:6
i=8,n=4, mL:4 v (4+1)=35, mG:6

make sub_arr = arr[start . . . end]
return
*/
public class int3 {
    public static int[] result (int[] arr) {
        if (arr == null || arr.length < 1) return null;
        int mLoc = arr[0], mGl = arr[0];
        int st_i = 0, end_i = 0;

        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            int old_mGl = mGl;
            if (n > n + mLoc) st_i = i;
            mLoc = Math.max(n, n + mLoc);
            mGl = Math.max(mLoc, mGl);
            if (mLoc > old_mGl) end_i = i;
            System.out.println("n: " + n);
            System.out.println("oldGL: " + old_mGl);
            System.out.println("mLoc: " + mLoc);
            System.out.println("mGl: " + mGl);
            System.out.println("start: " + st_i);
            System.out.println("end: " + end_i);
        }
        // st_i = 3, end = 6, l=4, 4,-1,2,1
        // make subarray result
        int len = end_i - st_i + 1; // 4
        System.out.println("len: " + len);
        int[] result = new int[len];
        for (int i = 0; i < len - 1; i++) {
            result[i] = arr[st_i];
            st_i++;
            System.out.println("i: " + i);
            System.out.println("result-i: " + result[i]);
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] output = result(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}