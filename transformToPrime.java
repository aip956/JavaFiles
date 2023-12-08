import java.util.*;
import java.lang.Math;
public class transformToPrime {

    public static int minNumber(int arr[], int N)
    {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        if sum is prime

    }

    public static boolean isPrime(int num) {
        if (num <= 2) {
            return false;
        }
        int squareRoot = Math.ceil(sqrt(num));
        for (int i = 3; i < squareRoot; i++) {
            if (num % i == 0) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int arr[] = {2, 4, 6, 8, 12};
        System.out.println("Output: " + minNumber(arr, N));
    }


}


/*
 * https://www.geeksforgeeks.org/problems/transform-to-prime4635/1
 * create function to determine if a number is prime (> 2, mod 3 - sqrt num not 0; sqrt(num))
 * sum the array; if sum not prime, return 0
 * 
 */