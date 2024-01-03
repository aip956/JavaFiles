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

Example 2:
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
 */

import java.util.ArrayList;

public class subArrWGivSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        /*
        check if the s = 0; if so, return the index at 0, +1; else return -1
        left and right indices; start at 0, 0
        while right index < n
        sum with right index; sum += arr[right]
        if sum > s, remove elements starting at left until no longer exceeding s
        check if the sum = s, if so add 1 to the indices and return
        increment right index
        if there is no sum == s, return -1
         int arr[] = {1,2,3,4,5,6,7,8,9,10};
         solution below passes!
        */ 
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        System.out.println("s: " + s);

        if (s == 0) {
            // If the target sum is 0, and the array contains 0, return the first occurrence of the 0
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    result.add(i + 1);
                    result.add(i + 1);
                    return result;
                }
            }
            result.add(-1);
            return result;
        }

        while(right < n) {
            sum += arr[right];
            System.out.println("51rightInd: " + right);
            System.out.println("51sum: " + sum);
            while (sum > s) {
                System.out.println("60leftInd: " + left);
                sum -= arr[left];
                System.out.println("62sum: " + sum);
                left++;
            }
            if (sum == s) {
                result.add(left+1);
                result.add(right+1);
                return result;
            }
            right++;
        }
        result.add(-1);
        return result;
    }
 
    //  static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    //           System.out.println("58sum: " + sum + ", s: " + s);
    // {        
    //     //right = 1, add arr[right] until >= s
    //     // if = s, return left+1 and right+1; add to arrayList
    //     // if > s, add left++, reset right to left+1, add arr[right]
    //     int left = 0;
    //     int right = 0;
    //     int cummulativeTotal = 0;
    //     ArrayList<Integer> result = new ArrayList<>();
    //     if (s == 0 || n == 0) {
    //         result.add(-1); 
    //         return result;
    //     }
    //     while (right < n) {
    //         System.out.println("right: " + right);
    //         System.out.println("n: " + n);
    //         cummulativeTotal += arr[right];
    //         while (cummulativeTotal > s) {
    //             cummulativeTotal -= arr[left];
    //             left++;
    //         }
    //         if (cummulativeTotal == s) {
    //                 result.add(left + 1);
    //                 result.add(right + 1);
    //                 return result;
    //             } 
    //         right++;
    //     }
    //     result.add(-1); 
    //     return result;
    // }


    public static void main(String[] args) {

        // int arr[] = {1,2,3,7,5};
        // int n = 5;
        // int s = 12;
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // int n = 10;
        // int s = 9;
        // int arr[] = {0};
        // int n = 1;
        // int s = 0;
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
