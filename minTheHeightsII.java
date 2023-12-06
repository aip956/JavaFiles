import java.util.*;

public class minTheHeightsII {
    public static int getMinDiff(int[] arr, int n, int k) {
        // code here
        // Arrays.sort(arr);
        int sum = 0;
        int diff = 0;
        int maxDiff = 0;
        for (int element : arr) {
            sum += element;
        }
        int avg = sum / n;
        int minHeight = 110;
        int maxHeight = 0;
        // { 1, 3, 4, 3, 9, 4}; sum = 24, avg = 4
        // 
        for (int element : arr) {
            if (element <= avg) {
                System.out.println("el: " + element);
                element += k;
                minHeight = Math.min(element, minHeight);
                System.out.println("minH: " + minHeight);
                diff = (maxHeight - minHeight);
                System.out.println("25diff: " + diff); 
            }
            if (element > avg) {
                System.out.println("el: " + element);

                element -= k;
                maxHeight = Math.max(element, maxHeight);
                System.out.println("minH: " + minHeight);
                diff = maxHeight - minHeight;
                System.out.println("34diff: " + diff); 

            }
        }
        return diff;
    }


    public static void main(String[] args) {
        int N1 = 4;
        int K1 = 2;
        int[] Arr = {1, 5, 8, 10};
        int[] Arr2 = {1, 3, 4, 3, 9, 4};
        System.out.println("Output1: " + getMinDiff(Arr2, N1, K1));
    }
}


/*
1. sort the array
2. Find average of array
3. for each element in the array, 
4. if element <= average, add k to the element; diff
5. diff = Math.max(diff, 

https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}. 
The difference between 
the largest and the smallest is 8-3 = 5.
Example 2:

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}. 
The difference between 
the largest and the smallest is 17-6 = 11. 
Your Task:
You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n, and k as input parameters and returns an integer denoting the minimum difference.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)

Constraints
1 ≤ K ≤ 109
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 109

 */