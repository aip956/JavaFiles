// https://practice.geeksforgeeks.org/problems/largest-number-possible5028/1
// Given two numbers "N" and "S", find the largest number that can be formed
// with N digits that sum to "S". Return -1 if not possible
// Ex: N = 2; S = 9 => 90
// for 


public static class largestNumPoss {
    static String findLargest(int N, int S){
        // code here; if N = 2, S = 100; can't be done; 99 < 100
        // Stringbuild 9 while < S
        if (N * 9 < S) return -1; // need if statement if can't be done
        
        for ()
    }


    public static void main (String[] args) {
        int n1 = 2;
        int s1 = 9;
        System.out.println("Output1: " + findLargest(n1, s1));
    }

}
