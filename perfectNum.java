/* https://practice.geeksforgeeks.org/problems/perfect-numbers3207/1
Given a number N, check if a number is perfect or not. 
A number is said to be perfect if sum of all its factors excluding 
the number itself is equal to the number. Return 1 if the number is 
Perfect otherwise return 0.
6: 1, 2, 3, 6; 10: 1, 2, 5
16: 1, 2, 4, 4, 8, 16 => 11, 19
*/ 

public class perfectNum {
    static int isPerfectNumber(long N) {
        // code here; for 2 - sqr rt N, sum multiples
        if (N == 1) return 0;
        long sum = 1; // declare as long or will get overflow!
        for (long i = 2; i * i <= N ; i++) {
            if (N % i == 0) {
                sum += i;
                sum += N / i;
                System.out.println("20i: " + i);
                System.out.println("21sum: " + sum);
            }
        }
        if (sum == N) return 1;
        else return 0;
    }


    public static void main(String[] args) {
        // long n1 = 6L;
        long n2 = 8589869056L;
        // long output1 = isPerfectNumber(n1);
        long output2 = isPerfectNumber(n2);
        // System.out.println("Result1: " + output1); 
        System.out.println("Result2: " + output2);
    }
}
