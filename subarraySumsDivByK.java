

class subarraySumsDivByK {
    public static int subarraysDivByK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int numArrs = 0;
        int sum;
        // [4,5,0,-2,-3,1]
        while (left < nums.length) {
            System.out.println("10leftt: " + left);
            sum = 0;
            right = left;
            while (right < nums.length) {
                System.out.println("11rightInd: " + right);
                System.out.println("15nums[right]: " + nums[right]);
                System.out.println("15sumBef: " + sum);
                sum += nums[right];
                System.out.println("18sumAft: " + sum);
                if (sum % k == 0) {
                    numArrs++;
                    System.out.println("21numArrs: " + numArrs);
                }
                right++;
            }
            left++;
        }
        return numArrs;
    }


    public static void main(String[] args) {
        // int[] nums = {4,5,0,-2,-3,1};
        // int k = 5;
        int[] nums = {5};
        int k = 9;
        System.out.println("Output: " + subarraysDivByK(nums, k));
    }
}


/* Works, but does not pass since it times out
Here is chatGPT's response:
public int subarraysDivByK(int[] nums, int k) {
    int[] modCounts = new int[k];
    int count = 0;
    int sum = 0;
    modCounts[0] = 1; // To include subarrays that start at index 0
    
    for (int num : nums) {
        sum = (sum + num) % k;
        if (sum < 0) // Handling negative remainders
            sum += k;
        
        count += modCounts[sum];
        modCounts[sum]++;
    }
    return count;
}
This solution uses a hash map modCounts to store the counts of remainders encountered 
while iterating through the array. It updates the count whenever a particular remainder 
is encountered, indicating that a subarray with a sum divisible by k has been found.

This optimized solution has a time complexity of O(N), where N is the length of the 
nums array, making it more efficient for larger inputs and preventing timeout errors.



https://leetcode.com/problems/subarray-sums-divisible-by-k/
974. Subarray Sums Divisible by K
Medium
6.4K
268
Companies
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0
 

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
2 <= k <= 104
 */