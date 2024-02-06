import java.util.*;

public class diagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
   // Write your code here
   // left and right sums; cols = length.arr[0]; row = length.arr
   // rightSum: 4x4; n = 4; (0,3) (1, 2) (3, 1) (4, 0)
    //    int diff = 0;
       int leftSum = 0;
       int rightSum = 0;
       int n = arr.size();

       for (int i = 0; i < n; i++) {
        System.out.println("15i: " + i);
           for (int j = 0; j < n; j++) {
            System.out.println("17j: " + j);
               if (i == j) {
                
                System.out.println("18arr.get(i).get(j): " + arr.get(i).get(j));
               leftSum += arr.get(i).get(j);
               System.out.println("20leftSum: " + leftSum);
           }
            if (j == n - 1 - i) {
                    System.out.println("21ij: " + j + ", n-1-i: " + (n - 1 - i));
                    System.out.println("22arr.get(i).get(j): " + arr.get(i).get(j));
                    rightSum +=  arr.get(i).get(j);
                    System.out.println("26rightSum: " + rightSum);
            }
           }
       }
   return Math.abs(leftSum - rightSum);
   }

   public static void main(String[] args) {
    List<List<Integer>> arr = List.of(
        List.of(11, 2, 4), 
        List.of(4, 5, 6), 
        List.of(10, 8, -12)
        );
    System.out.println("Output: " + diagonalDifference(arr));
   }



}

/*
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 * 
 */