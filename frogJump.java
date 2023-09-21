/* https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1
A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it 
reach the top of Nth step. As the answer will be large find the answer modulo 
1000000007.
*/
import java.util.*;

public class frogJump {
    static long countWays(int n)
    {
        // add your code here
        if (n == 1) {
            return 1L;
        }
        if (n == 2) {
            return 2L;
        }

        long oneSt = 1L;
        long twoSt = 1L;
        long threeSt = 2L;
        long nextSt = 0;
        for (int i = 0; i < n - 2; i++) {
            long temp1 = twoSt;
            long temp2 = threeSt;
            nextSt = (oneSt + twoSt + threeSt) % 1000000007;
            System.out.println("nextSt: " + nextSt);
            System.out.println("threeSt: " + threeSt);
            System.out.println("twoSt: " + twoSt);
            System.out.println("oneSt: " + oneSt);
            
            oneSt = twoSt;
            twoSt = threeSt;
            threeSt = nextSt;
        }
    return nextSt;
    }

    
    public static void main(String[] args) {
        // int n1 = 5;
        int n2 = 54;
        // long output1 = countWays(n1);
        long output2 = countWays(n2);
        // System.out.println("Result1: " + output1);
        System.out.println("Result2: " + output2);
    }
}
