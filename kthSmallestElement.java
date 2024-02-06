// import java.util.stream.IntStream;
import java.util.*;

public class kthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    {   // passes!
        // Convert to array list
        // Sort array list
        // get element k+1; return it
        // Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        // create wrapper array from primitive arr
        // Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(array));

        // create array list, copy arr into it
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        Collections.sort(arrList);
        // System.out.println(arrList);
    

        return arrList.get(k-1);
    } 

    public static void main(String[] args) {
        // int[] arr = {7, 10, 4, 20, 15};
        // int K = 4;
        // int L = 0;
        // int R = 4;
        int[] arr = {7, 10, 4, 20, 15, 25, 12, 33, 19};
        int K = 4;
        int L = 0;
        int R = 10;
        System.out.println("Output: " + kthSmallest(arr, L, R, K));
    }
}


/*
 * https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&sortBy=submissions
 * Given an array arr[] and an integer K where K is smaller than 
 * size of array, the task is to find the Kth smallest element 
 * in the given array. It is given that all array elements are distinct.

Note :-  l and r denotes the starting and ending index of the array.

Example 1:
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
L=0 R=5
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.

Example 2:
Input:
N = 5
arr[] = 7 10 4 20 15
K = 4 L=0 R=4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.
 */