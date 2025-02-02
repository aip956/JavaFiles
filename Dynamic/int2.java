public class int2 {
    public static int[] sub_arr (int[] arr) {
        // base case
        if (arr == null || arr.length < 1) return null;
        //  mLoc = max (n, n+mLoc)
        //  mGl = max (mLoc, mGl)
        //  start_i
        // end_i for subarray



        // create sub_arr
        int[] sub_arr = new int[];

        return sub_arr;
    }

}



/*
* given array of integers, find the subarray with greatest sum
 * return subarray
 * pos int, 0, neg int
 * {1,2,3,-5,0,1,2} => {1,2,3}
 * i=0,n=1,mL=1,mG=1
 * i=1,n=2,mL=2 or 2+1=3,mG=3
 * i=2,n=3,mL=3 or 3+3=6,mG=6
 * i=3,n=-5,mL=-5 or -5+6=1,mG=6
 * mLoc = max (n, n+mLoc)
 * mGl = max (mLoc, mGl)
 * start_i, end_i for subarray
 */