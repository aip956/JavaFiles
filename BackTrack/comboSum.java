class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        return [[1], [1]];
    }

    public static void main(String[] args) {
        int[] cands1 = {2, 3, 6, 7}; // [[2,2,3], [7]]
        int targ1 = 7;
        System.out.println(combinationSum(cands1, targ1));
    }
}