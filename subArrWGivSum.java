// https://www.geeksforgeeks.org/find-subarray-with-given-sum/
/*
Traverse the array from start to end.
From every index start another loop from i to the end of the array to get all subarrays starting from i, and keep a variable currentSum to calculate the sum of every subarray.
For every index in inner loop update currentSum = currentSum + arr[j]
If the currentSum is equal to the given sum then print the subarray.
 */

import java.util.ArrayList;

public class subArrWGivSum {
     static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {        
        //right = 1, add arr[right] until >= s
        // if = s, return left+1 and right+1; add to arrayList
        // if > s, add left++, reset right to left+1, add arr[right]
        int left = 0;
        int right = 0;
        int cummulativeTotal = 0;
        ArrayList<Integer> result = new ArrayList<>();
        if (s == 0 || n == 0) {
            result.add(-1); 
            return result;
        }
        while (right < n) {
            System.out.println("right: " + right);
            System.out.println("n: " + n);
            cummulativeTotal += arr[right];
            while (cummulativeTotal > s) {
                cummulativeTotal -= arr[left];
                left++;
            }
            if (cummulativeTotal == s) {
                    result.add(left + 1);
                    result.add(right + 1);
                    return result;
                } 
            right++;
        }
        result.add(-1); 
        return result;
    }


    public static void main(String[] args) {

        // int arr[] = {1,2,3,7,5};
        // int n = 5;
        // int s = 12;
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // int n = 10;
        // int s = 20;
        // int arr[] = {1,2};
        // int n = 2;
        // int s = 1;
        // int arr[] = {1,2,3,4};
        // int n = 4;
        // int s = 0;
        int arr[] = {1,2,3,4};
        int n = 4;
        int s = 0;
        ArrayList output =subarraySum(arr, n, s);
        System.out.println("Output: " + output); // Output: 
    }
}
