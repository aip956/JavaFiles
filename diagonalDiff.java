import java.util.List;

public class diagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
   // Write your code here
   // left and right sums; cols = length.arr[0]; row = length.arr
   // rightSum: 4x4; n = 4; (0,3) (1, 2) (3, 1) (4, 0)
    //    int diff = 0;
       int leftSum = 0;
       int rightSum = 0;
       int n = arr.size();
       // int j = 0;
       // int i = 0;
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               if (i == j) {
               leftSum += arr.get(i).get(j);
           }
           if (j == n - 1 - i) {
               rightSum =+  arr.get(i).get(j);
           }
           }
       }
   return Math.abs(leftSum - rightSum);
   }

   public static void main(String[] args) {
    List<List<Integer>> arr = {{11, 2, 4}, {4, 5, 6} , {10, 8, -12}};
    System.out.println("Output: " + diagonalDifference(arr));
   }



}

/*
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 * 
 */