// https://www.geeksforgeeks.org/find-subarray-with-given-sum/

/*
https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
Traverse the array from start to end.
From every index start another loop from i to the end of the array to get all subarrays starting from i, and keep a variable currentSum to calculate the sum of every subarray.
For every index in inner loop update currentSum = currentSum + arr[j]
If the currentSum is equal to the given sum then print the subarray.

Given an unsorted array A of size N that contains only non negative integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
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
