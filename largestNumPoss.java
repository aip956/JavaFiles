/* https://practice.geeksforgeeks.org/problems/largest-number-possible5028/1
Given two numbers "N" and "S", find the largest number that can be formed
with N digits that sum to "S". Return -1 if not possible
 Ex: N = 2; S = 9 => 90
30; 9; 9; 9; 
Ex: N = 2; S = 4 => 40
*/

public static class largestNumPoss {
    static String findLargest(int N, int S){
        // code here; if N = 2, S = 100; can't be done; 99 < 100
        // Stringbuild 9 while < S
        if (N * 9 < S) return -1; // need if statement if can't be done
        // 9 + 10*9
        StringBuilder output = new StringBuilder();
        int sum;
        while (sum < S) {
            sum += 9;
            output.append(9);
        }
        int diff = S - sum;
        output.append(diff);
    }


    public static void main (String[] args) {
        int n1 = 2;
        int s1 = 9;
        System.out.println("Output1: " + findLargest(n1, s1));
    }

}
