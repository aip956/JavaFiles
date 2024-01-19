public class kadanes {
    long maxSubarraySum(int arr[], int n){
        
        // Each element in array
        // create maxEndingHere: max of num vs. sum num+maxEndHere
        // maxSoFar: max of maxSoFar and maxEndingHere
        long maxEndHere = arr[0];
        long maxSoFar = arr[0];
        for (int i = 1; i < n; i++) {
            System.out.println("10maxEndHere: " + maxEndHere);
            maxEndHere = Math.max(arr[i], arr[i]+maxEndHere);
            System.out.println("arr[i]: " + arr[i]);
            System.out.println("arr[i]+maxEndHere: " + (arr[i]+maxEndHere));
            System.out.println("maxEndHere: " + maxEndHere);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
            System.out.println("maxSoFar: " + maxSoFar);
        }
        return maxSoFar;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        int n = 5;
        // int arr[] = {-1,-2,-3,-4};
        // int n = 4;
        kadanes kadanesInst = new kadanes();
        Long output = kadanesInst.maxSubarraySum(arr, n);
        System.out.println("Output: " + output); // Output: 
    }
}

/*
 * https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&sortBy=submissions
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number)
 * which has the maximum sum and return its sum.


Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.

Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

Your Task:
You don't need to read input or print anything. The task is to complete the function maxSubarraySum() 
which takes Arr[] and N as input parameters and returns the sum of subarray with maximum sum.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
-107 ≤ A[i] ≤ 107
 * 
 */