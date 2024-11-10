import java.util.*;

class MinRotSortArr {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (right + left) / 2;

            // Check if mid is in the rotated part or sorted part
            if (nums[mid] > nums[right]) {
                // Min must be in right half
                left = mid + 1;
            } else {
                // Min could be mid or in the left half
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}

/*
 https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 1. Binary Search Loop
 Narrow range [left, right] until left = right
 2. Condition Check
 nums[mid] > nums[right]: rotation on right side so move left to mid + 1
 nums[mid] <= nums[right]: min is on left side or is nums[mid], so move right to mid
 3. Return result
 When left == right, min elem is at nums[left]

 Time: O(log n): performing binary search
 Space: O(1): Using constant space

 */