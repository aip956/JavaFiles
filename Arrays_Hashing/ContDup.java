import java.utill.*;
class ContDup {
    public boolean containsDuplicate(int[] nums) {
     
        
    }

    public static void main(String[] args) {
        int nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}





/*
Make a set of the numbers; if the set size = array size, no dups
https://leetcode.com/problems/contains-duplicate/description/
Given an integer array nums, return true if any value appears 
at least twice in the array, and return false if every element
 is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 
 */