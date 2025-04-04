import java.util.*;

class LrgElInArr {
    public static int findKthLargest(int[] nums, int k) {
        if (nums.length == 0 || nums == null) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int elem : nums) {
            System.out.println("9: " + elem);
            if (pq.size() < k) {
                pq.add(elem);
                System.out.println("12: " + pq);
            } else {
                if (elem > pq.peek()) {
                    pq.poll();
                    pq.add(elem);
                    System.out.println("17pq: " + pq);
                }
            }
        }
        return pq.peek();
    }


    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
        System.out.println(findKthLargest(nums1, k1));
        System.out.println();
        int[] nums2 = {7,10,4,3,20,15};
        int k2 = 3;
        System.out.println(findKthLargest(nums2, k2));
        System.out.println();
        int[] nums3 = {};
        int k3 = 3;
        System.out.println(findKthLargest(nums3, k3));
        System.out.println();
        int[] nums4 = {3,2,3,1,2,4,5,5,6};
        int k4 = 4;
        System.out.println(findKthLargest(nums4, k4));
        System.out.println();
        
    }
}





/* 
Use pq, size n
but need to manually limit pq to n; pq.size()
iterate through elements; if pq.size < n, add
if pq.size >= n, pq.poll()
if elem > pq[0], pq.add(elem)


Larges Element in Array
 * Find the Kth Largest Element in an Array
https://leetcode.com/problems/kth-largest-element-in-an-array/description/

Problem Statement:
 Given an unsorted array of integers, find the kth largest element 
in the array. Do not use built-in sorting functions.

Requirements:
The algorithm should run in O(n log n) or better time complexity.


The function should return an integer representing the kth largest element.


Example Cases:
Input: nums = [3,2,1,5,6,4], k = 2  
Output: 5  

Input: nums = [7,10,4,3,20,15], k = 3  
Output: 7 


 */