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

Start at n
DP array of index 0 to n
at n, there is 1 way to get to n
at n-1, there is 1 way to get to n
at n-2, there are 2 ways to get to n; or 1 + 1 from 2 prev = 2
at n-3, 2 + 1 = 3
at n-4, 3 + 2 = 5
n - 5;, 5 + 3 = 8
val at n - 2 = val_onestep + val_twostep
then shift

 */

public class climbingStairs {
  public static int climb(int n) {
    int oneSt = 1;
    int twoSt = 1;
    System.out.println("n: " +n);
    for (int i = 0; i < n-1; i++) {
        int temp = oneSt;
        oneSt = oneSt + twoSt; 
        twoSt = temp;
        System.out.println("i: " +i);
        System.out.println("oneSt: " + oneSt);
    }
    return oneSt;
  }  


    public static void main(String[] args) {
        int n = 5;
        int n2 = 7;
        System.out.println("Result: " + climb(n));
        System.out.println("Result: " + climb(n2));
    }
}