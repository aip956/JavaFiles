/* given array of integers, find the subarray with greatest sum
return subarray {-2,1,-3,4,-1,2,1,-5,4}; // 4,-1,2,1; s=3, e=6, l=4
mLoc: n vs. n+mLoc
mGl: mLoc vs. mGl
start_i: n > n+mLoc
end_i: mL > old mG
i=0,n=-2, mL:-2v(-2+0)=-2, mG:-2
i=1,n=1, mL:1 v (-2+1)=-1, mG:1
i=2,n=-3, mL:-3 v(-3+-1)=-3, mG:1
i=3,n=4, mL:4 v (-3+4)=4, mG:4; s: n>n+mL
i=4,n=-1, mL:-1 v (-1+4)=3, mG:4
i=5,n=2, mL:2 v (2+3)=5, mG:5
i=6,n=1, mL:1 v (1+5)=6, mG:6; e: mL > old mG
i=7,n=-5, mL:-5 v (-5+6)=1, mG:6
i=8,n=4, mL:4 v (4+1)=35, mG:6

make sub_arr = arr[start . . . end]
return
*/
public int3 {
    public static int[] result (int[] arr) {



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
        
    }
}