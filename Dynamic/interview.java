public class interview {
    public static int[] result (int[] arr) {
        if (arr == null || arr.length == 0) return null;
        int mLoc=arr[0], mGl=arr[0]; // Local and Global max
        // mLoc = max of n vs. n + mLoc
        // mGl = max of mLoc vs. mGl
        int start_i = 0, end_i = 0; // start and end of subarray
        
        for (int i = 1; i < arr.length; i++) {
            // int temp_mLoc = mLoc;
            int old_mGl = mGl;
            int n = arr[i];
            // start subarr ind if n > old mLoc
            // end subarr in if new maxLoc > old maxGl
            if (n > mLoc + n) start_i = i;
            mLoc = Math.max(n, n + mLoc);
            mGl = Math.max(mLoc, mGl);
            if (mGl > old_mGl) end_i = i;
            System.out.println("n: " + n);
            System.out.println("old_GL: " + old_mGl);
            System.out.println("mL: " + mLoc);
            System.out.println("mGl: " + mGl);
            System.out.println("start: " + start_i);
            System.out.println("end i: " + end_i);
            System.out.println();

        }
        // {-2,1,-3,4,-1,2,1,-5,4} => {4,-1,2,1}, i= 3->6
        int new_arr_len = end_i - start_i + 1; // 4
        int[] arr_grtst = new int[new_arr_len];
        for (int i = 0; i < new_arr_len; i++) {
            arr_grtst[i] = arr[start_i];
            System.out.println("arr elem: " + arr_grtst[i]);
            start_i++;
        }

        return arr_grtst;
    }

    public static void main(String[] args) {
        // int[] array = {1,2,3,-5,0,1,2};
        int[] array = {-2,1,-3,4,-1,2,1,-5,4}; // 4,-1,2,1

        int [] output = result(array);
        System.out.print("Output: ");
        for (int i = 0; i < output.length; i++){
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("\n");
    }

}


/*
 * given array of integers, find the subarray with greatest sum
 * return subarray
 * pos int, 0, neg int
 * {1,2,3,-5,0,1,2} => {1,2,3}

 * mLoc=num[i] vs. mLoc+ num[i]; mG=mLoc vs. mG
 * new subarray: restart i at i if n > mLoc+i
 * i=0, n=1, mL=1, mG=1
 * i=1,n=2, mL=2 vs. (2+1=3), mL=3, mG=3
 * i=2, n=3, mL=3 vs.(3+3), mL=6, mG=6
 *  * newML > oldMG; end
 * i=3, n=-5, mL= -5 vs. (-5+6=1), mL=1, mG=6; 
 * i=4, n=0, mL = 0 vs. (0+1=1), mL=1, mG=6
 * i=5, n=1, mL = 1 vs. (1+1=2),mL = 2, mG=6
 * i=6, n=2, mL = 2 vs. (2+2=4),mL=4,mG=6
 * 

 mLoc=num[i] vs. mLoc+ num[i]; mG=mLoc vs. mG
 new subarray: restart i at i if n > mLoc+i
 {-2,1,-3,4,-1,2,1,-5,4} => {4,-1,2,1}, i= 3->6
    mL= n vs. n+mL; mG=mL vs. mG
    i=0, n=-2, mL[0] = -2, mG=-2, 
    i=1, n=1, mL[1]= 1 or -1 = 1, mG=1
    i=2, n=-3,mL[2] = -3 or (-3 + 1) = -2, mG=1
n > n+mL; restart
    i=3, n=4, mL[3]= 4 or (-2 + 4) = 4, mG=4
    i=4, n=-1, mL=-1 or (-1+4) = 3, mG=4
    i=5, n=2, mL=2 or (2+3)=5, mG=5
new mL = 6, old mG=5; newML > oldMG; end
    i=6, n=1, mL=1 or (1+5)=6, mG=6
    i=7, n= -5, mL= -5 or(6+-5)=1, mG=6
    i=8, n=4, mL=4 or (1+4)=5, mG=6

 * explain thinking
 * could be entire array
 */