import java.util.*;

class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] candidates, int target, int s, List<Integer> current, List<List<Integer>> result) {
        if(target == 0) {
        result.add(new ArrayList<>(current));
        return;
    }
    if (target < 0) return;
    for(int i = s; i < candidates.length; i++) {
        if(candidates[i] < target) break;
        current.add(candidates[i]);
        backtrack(candidates, target - candidates[i], i, current, result);
        current.remove(current.size() - 1);
    }


    public static void main(String[] args) {
        int[] cands1 = {2, 3, 6, 7}; // [[2,2,3], [7]]
        int targ1 = 7;
        System.out.println(combinationSum(cands1, targ1));
    }
}
/*
[2,3,5], targ = 8
iterate over array, but do not include previous elements
(they will repeat if so)
2
2,2 => starts w 2
2,2,2 => starts w 2,2
2, 2, 2, 2 = valid, 
2,2,2,3; too big, now backtrack
2,3

2,2,2,2
 https://leetcode.com/problems/combination-sum/


 Given an array of distinct integers candidates 
 and a target integer target, return a list of 
 all unique combinations of candidates where the 
 chosen numbers sum to target. You may return the 
 combinations in any order.

The same number may be chosen from candidates an 
unlimited number of times. Two combinations are 
unique if the frequency of at least one of the 
chosen numbers is different.

The test cases are generated such that the number 
of unique combinations that sum up to target is 
less than 150 combinations for the given input.

 

Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []
 */