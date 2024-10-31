import java.util.*;
class longConsSeq {
    public static int longestConsecutive(int[] nums) {
        // use a hashset to store each element
        // for each num in nums, check if num - 1 is not in the hashset
        // from this start number, count how many consecutive numbers are in the seq
        // track the longest sequence

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longStreak = 0;
        // find longest consec seq
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consec nums
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                // update longest streak
                longStreak = Math.max(longStreak, currentStreak);
            }
        }
        return longStreak;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums1));
    }
}

/*
 * 
Given an unsorted array of integers nums, 
return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */