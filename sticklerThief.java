// https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1
/*
 Create array to store max money at i'th house


 */

import java.util.*;

public class sticklerThief {
    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        // Create array size n to store max looted amount to ith house
        int[] dp = new int[n];

        // max amount looted up to the 1st house is amount in 1st house
        dp[0] = arr[0];

        // for 2nd house, choose max between 1st and 2nd house
        dp[1] = Math.max(arr[0], arr[1]);

        // iterate for remaining houses
        for (int i = 2; i < n; i++) {
            // To decide whether to loot the ith house, choose the max between:
            // 1. Max amount looted up to the (i-2)th house + amount in current house
            // 2. Max amount looted up to the (i-1)th house
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        }
        // Final element in dp[] will contain the max amount looted
        return dp[n-1];

    }




    public static void main(String[] args) {
        int[] a1 = {6, 5, 5, 7, 4};
        int n1 = 5;
        System.out.println("Output1: " + FindMaxSum(a1, n1));
        int[] a2 = {1, 5, 3};
        int n2 = 3;
        System.out.println("Output2: " + FindMaxSum(a2, n2));
    }
    
}
