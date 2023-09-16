// https://leetcode.com/problems/climbing-stairs/description/
/*
Time Complexity:
The code uses a loop that runs for n-1 iterations 
(from i = 0 to i = n-2) to compute the number of 
ways to climb the stairs. Inside the loop, there 
are only constant time operations (addition and 
swapping of variables). Therefore, the time complexity is O(n).

Space Complexity:
The code uses two integer variables (oneSt and twoSt) 
to keep track of the number of ways to reach the 
current step. These variables occupy a constant amount 
of space regardless of the value of n. Therefore, 
the space complexity is O(1), indicating constant space usage.

So, the code has a time complexity of O(n) 
and a space complexity of O(1), making it an 
efficient solution for the "Climbing Stairs" problem.
 */

public class climbingStairs {
  public static int climb(int n) {
    int oneSt = 1;
    int twoSt = 1;
    for (int i = 0; i < n-1; i++) {
        int temp = oneSt;
        oneSt = oneSt + twoSt; 
        twoSt = temp;
        System.out.println(oneSt);
    }
    return oneSt;
  }  


    public static void main(String[] args) {
        int n = 5;
        
        System.out.println("Result: " + climb(n));
    }
}