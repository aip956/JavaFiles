import java.util.*;

class MinRotSortArr {
    public static int findMin(int[] nums) {
        

        return
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