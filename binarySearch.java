public class binarySearch {
    static int binarysearch(int arr[], int n, int k) {
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = (high + low) / 2;
            System.out.println("21mid: " + mid);
            System.out.println("22low: " + low);
            System.out.println("23high: " + high);
            System.out.println("24arr[mid]: " + arr[mid]);
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
                System.out.println("29low: " + low);
            } else {
                high = mid - 1;
                System.out.println("31high: " + high);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 5;
        int k = 4;
        // int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};  //12
        // int n = 15;
        // int k = 13;
        // mid = 8
        // mid = mid + 15 - 8 / 2; 11; low = 8
        // mid = low = 11; mid(11) + 4/2 = 13
        // mid = high = 13; 

        // int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 121, 133, 144};
        // mid = 13/2 = 6
        // mid = 6 + (13-6/2) = 9; arr[9] = 111
        // mid = 9 + (13 - 9)/2 = 11; arr[11] = 133
        // mid = 11 (133);  + (13 - 11)/2 = 12 
        // int n = 16;
        // int k = 121;
        // int arr[] = {11, 22, 33, 44, 55};
        // int n = 5;
        // int k = 445;
        // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 17, 18, 19, 20, 21, 22, 25, 26, 27, 29, 31, 32, 33, 35, 36, 40, 41, 42, 43, 46, 47, 48, 51, 54, 55, 56, 57, 58, 61, 63, 64, 65, 67, 69, 71, 74, 77, 78, 79, 80, 81, 82, 83, 85, 86, 87, 88, 89, 90, 91, 93, 95, 99, 100};
        // int n = 68;
        // int k = 99;
        System.out.println("Output: " + binarysearch(arr, n, k));

    }
}


        // code here
        // find midpoint of arr
        // is midpoint == k; return index + 1
        // if mid < k, search on right
        // search fails if:
        // {0, 1, 2, 3, 4, 5, 6, 8, 9, 10}; k = 7
        // k is out of bounds
        // G4G: initial left, right, middle
        // while left < right, define middle
        // Check if array[middle] == k, return middle
        // if arr[m] < x, left = middle + 1
        // else right = middle - 1
        // else return -1
/*
 * https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&difficulty=Basic&sortBy=submissions
 * Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in 
 * the array using binary search.

Example 1:
Input:
N = 5
arr[] = {1 2 3 4 5} 
K = 4
Output: 3
Explanation: 4 appears at index 3.

Example 2:
Input:
N = 5
arr[] = {11 22 33 44 55} 
K = 445
Output: -1
Explanation: 445 is not present.

Your Task:  
You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], N and K 
as input parameters and returns the index of K in the array. If K is not present in the array, return -1.


Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.


Constraints:

1 <= N <= 105
1 <= arr[i] <= 106
1 <= K <= 106
 */