public class int2 {
    public static int[] sub_arr (int[] arr) {
        // base case
        if (arr == null || arr.length < 1) return null;
        //  mLoc = max (n, n+mLoc)
        //  mGl = max (mLoc, mGl)
        //  start_i: if n > n+prev mL
        //  end_i for subarray: if new mL > old MG

        int mLoc = arr[0];
        int mGl = arr[0];
        int start_i = 0;
        int end_i = 0;

        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            int old_mGl = mGl;
            if (n > mLoc + n) start_i = i;
            mLoc = Math.max(n, n + mLoc);
            mGl = Math.max(mLoc, mGl);
            if (mLoc > old_mGl) end_i = i;
        }
        System.out.println("start: " + start_i);
        System.out.println("end: " + end_i);

        // create sub_arr; {0,1,2}; start=4, end=6
        int sa_len = end_i - start_i + 1; // 3
        int[] sub_arr = new int[sa_len];
        for (int i = 0; i < sa_len; i++) {
            sub_arr[i] = arr[start_i];
            System.out.println("sub_arr elem: " + sub_arr[i]);
            start_i++;
        }
    



        // int[] sub_arr_res = {1, 2, 3};

        return sub_arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-5,0,1,2};
        int[] sub_arr_out = sub_arr(arr);
        for (int i = 0; i < sub_arr_out.length; i++) {
            System.out.print(sub_arr_out[i]);
            if (i < sub_arr_out.length - 1) {
                System.out.print(",");
            }
        }
    }

}



/*
* given array of integers, find the subarray with greatest sum
 * return subarray
 * pos int, 0, neg int
 * {1,2,3,-5,0,1,2} => {1,2,3}
 * i=0,n=1,mL=1,mG=1
 * i=1,n=2,mL=2 or 2+1=3,mG=3 : n !> mL[-1]+n, do not start+; new mL > old mGl, end++
 * i=2,n=3,mL=3 or 3+3=6,mG=6 : n !>= mL[-1]+n, do not start+; new ml > old mGl, end++
 * i=3,n=-5,mL=-5 or -5+6=1,mG=6 : !start++, end++
 * mLoc = max (n, n+mLoc)
 * mGl = max (mLoc, mGl)
 * start_i, end_i for subarray
 * return a subarr[starti . . . endi]
 */