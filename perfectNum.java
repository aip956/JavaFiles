/* https://practice.geeksforgeeks.org/problems/perfect-numbers3207/1
Given a number N, check if a number is perfect or not. 
A number is said to be perfect if sum of all its factors excluding 
the number itself is equal to the number. Return 1 if the number is 
Perfect otherwise return 0.
6: 1, 2, 3, 6
16: 1, 2, 4, 4, 8, 16
*/ 

public class perfectNum {
    static int isPerfectNumber(long N) {
        // code here; for 2 - sqr rt N, sum multiples
        int sum = 1;
        
        
        for (long i = 2; i * i <= N ; i++) {
            if (N % i == 0) {
                sum += i;
                sum += N / i;
                if (i)
            }
        }

    }


    public static void main(String[] args) {
        long n1 = 6L;
        long n2 = 10L;
        long output1 = isPerfectNumber(n1);
        long output2 = isPerfectNumber(n2);
        System.out.println("Result1: " + output1); 
        System.out.println("Result2: " + output2);
    }
}
