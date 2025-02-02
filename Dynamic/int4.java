/*
given array of integers, find the subarray with greatest sum
return subarray {-2,1,-3,4,-1,2,1,-5,4}; => {4,-1,2,1}
 */

public class int3 {
    public static int[] findMaxSub(int[] arr) {

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
    }


}