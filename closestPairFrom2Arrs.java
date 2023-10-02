/* https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1
Given two sorted arrays arr and brr and a number x, find the pair whose sum is closest to x and the pair has an element from each array. In the case of multiple closest pairs return any one of them.
Note: Can return the two numbers in any manner.

Example 1:

Input : N = 4, M = 4
arr[ ] = {1, 4, 5, 7}
brr[ ] = {10, 20, 30, 40} 
X = 32
Output : 
1, 30
Explanation:
The closest pair whose sum is closest
to 32 is {1, 30} = 31.
Example 2:

Input : N = 4, M = 4
arr[ ] = {1, 4, 5, 7}
brr[ ] = {10, 20, 30, 40}
X = 50 
Output : 
7, 40 
Explanation: 
The closest pair whose sum is closest
to 50 is {7, 40} = 47.
Your Task:
You only need to complete the function printClosest() that takes an array (arr), another array (brr), size of array arr (N), size of array brr (M), and return the array of two integers whose sum is closest to X. The driver code takes care of the printing of the closest difference.

Expected Time Complexity: O(N+M).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N, M ≤ 105
1 ≤ A[i], B[i] ≤ 109


*/
import java.util.*;
public class closestPairFrom2Arrs {

    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> minPair = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.println("48arr[i], brr[j]: " + arr[i] +" , " + brr[j]);
                System.out.println("48i: " + i);
                System.out.println("49j: " + j);
                int sum = arr[i] + brr[j];
                System.out.println("52sum: " + sum);
                int diff = x - sum;
                System.out.println("54diff: " + diff);
                minDiff = Math.min(minDiff, diff);
                System.out.println("56minDiff: " + minDiff);

                if (minDiff == diff) {
                    minPair.add(arr[i], brr[j]);
                }

                System.out.println("60minPair: " + minPair);
            }
        }
        System.out.println("57minPair: " + minPair);
        return minPair;
    }


    public static void main(String[] args) {
        int arr1[] = {1, 4, 5, 7};
        int brr1[] = {10, 20, 30, 40};
        int n1 = 4;
        int m1 = 4;
        int x1 = 31;
        System.out.println("Output1: " + printClosest(arr1, brr1, n1, m1, x1));
    }
}

// arrPtr = 0; brrPtr = 0; min = 0
// i = ind of arr; j = ind of brr
// arr[0] = 1; brr[0] = 10; minDiff = 20;
// arr[1] = 4; brr[0] = 10; minDiff = Min of (20, 31 - 14 = 17) = 17;
// continue with arr[i]
// do for brr[j]
