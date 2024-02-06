import java.util.*;

public class majorityElement {
    static int majorityElement(int a[], int size)
    {
        // this passes!
        int majEl = -1;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqMap);
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) > size / 2) {
                majEl = num;
                return majEl;
            }
        }
        return majEl;
    } 
    public static void main(String[] args) {
        // int N = 5;
        // int[] A = {3,1,3,3,2};
        int N = 1;
        int[] A = {15};
        System.out.println("Output: " + majorityElement(A, N));
    }
}

/*
make frequency map
if element's frequency > n/2, return element


 * https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&sortBy=submissions
 * Given an array A of N elements. 
 * Find the majority element in the array. 
 * A majority element in an array A of size N is an 
 * element that appears strictly more than N/2 times 
 * in the array.
 

Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.

Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.
 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 

Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106
 */
