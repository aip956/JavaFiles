import java.util.*;

public class diagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
   // Write your code here
   // left and right sums; cols  = rows = length.arr
   // rightSum: 4x4; n = 4; (0,3) (1, 2) (3, 1) (4, 0)
   // 3x3, n = 3: right = (0,2) (1,1), (2,0); 
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
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference
Input Format

The first line contains a single integer, , the number of rows and columns in the square matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x
 */