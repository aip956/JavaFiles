import java.util.*;

class SearchRotSortArr {
    public static int search(int[] nums, int target) {
        
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0; // 0
        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3; // 3
        System.out.println(search(nums1, target1));
        System.out.println(search(nums2, target2));
    }
}


/*
https://leetcode.com/problems/search-in-rotated-sorted-array/description/

1. Binary Search with Condition Checks
Two pointers, left and right, for start and end of search range
Calc middle index, mid

2. ID sorted halves
Since the array is rotated, either the left half or the right half of the array, 
relative to mid, will be sorted
If nums[left] <= nums[mid]: left half, from left to mid, is sorted
If nums[mid] <= nums[right]: right half, from mid to right, is sorted



There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1

 */