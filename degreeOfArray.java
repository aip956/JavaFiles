import java.util.*;

public class degreeOfArray {
    public static int findShortestSubArray(int[] nums) {
        HashMap <Integer, Integer> freqMap = new HashMap<>();
        int short_arr_len = Integer.MAX_VALUE;
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) +1);
        }
        
        // find degree
        int degree = 0;
        for (int freq : freqMap.values()) {
            degree = Math.max(degree, freq);
        }
        System.out.println("16degree: " + degree);

        // Find first and last occurence indices of elements with degree freq
        
        for (int num : freqMap.keySet()) { // iterate through the values
            System.out.println("21num: " + num);
            System.out.println("22freqMap.keySet(): " + freqMap.keySet());
            if(freqMap.get(num) == degree) { // if key num's value = degree
            
            int first_ind = -1;
            int last_ind = -1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) { // if elem in array is = key of degree
                    if (first_ind == -1) {
                        first_ind = i;
                    }
                    last_ind = i;
                }
            }
            short_arr_len = Math.min(short_arr_len, (last_ind - first_ind + 1));
            }
        }
        return short_arr_len;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,1,4,2};
        int[] arr2 = {1, 2, 2, 3, 1};
        System.out.println("Output1: " + findShortestSubArray(arr1));
        System.out.println("Output2: " + findShortestSubArray(arr2));
    
      }

}
/*
https://leetcode.com/problems/degree-of-an-array/submissions/1180371928/
Make frequency map
Find degree; greatest vals in freq map
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

 

Example 1:
Input: nums = [1,2,2,3,1]
Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Example 2:
Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation: 
The degree is 3 because the element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
 

Constraints:

nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
 */


