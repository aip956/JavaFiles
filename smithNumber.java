import java.util.*;
public class smithNumber {
    static int smithNum(int n) {
        // code here
        int sumOfDigs = addDigits(n);
        int sumOfFacts = findFactors(n);
        if (isPrime(n)) return 0;
        if (sumOfDigs == sumOfFacts) return 1;
        else return 0;
    }
    // check if prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        int squareRoot = (int)Math.sqrt(num);
        for (int i = 2; i <= squareRoot; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    // 378
    static int addDigits(int n) {
        int sum = 0;
        while (n > 0) {
            System.out.println("14n: " + n);
            int mod = n % 10; // 8, 7
            sum = sum + mod;; // 8
            System.out.println("17sum: " + sum);
            n /= 10; // 37
        }
        System.out.println("35addDigsSum: " + sum);
        return sum;
    }


    static int findFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int squareRoot = (int)Math.sqrt(n);
        // iterate for 3, add 2 for odd primes
        for (int i = 3; i <= squareRoot; i+=2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        // remaining n
        if (n > 2) {
            factors.add(n);
        }
        int factSum = 0;
        for (int num : factors) {
            factSum += addDigits(num);
        }
        System.out.println("61factors: " + factors);
        System.out.println("factSum: " + factSum);
        return factSum;
    }

    public static void main(String[] args) {
        // int n = 378;
        int n = 985;
        System.out.println(smithNum(n));
    }
}

/* Passes!
create Array List of prime factors
create function to sum digits
 * https://www.geeksforgeeks.org/problems/smith-number4132/1
 * Given a number n, the task is to find out whether this number 
 * is a Smith number or not. A Smith number is a composite number
 *  whose sum of digits is equal to the sum of digits of its 
 * prime factors.

Example 1:
Input:
n = 4
Output:
1
Explanation:
The sum of the digits of 4 is 4, and the sum of the digits of its 
prime factors is 2 + 2 = 4.

Example 2:
Input:
n = 378
Output:
1
Explanation:
378 = 21*33*71 is a Smith number since 3+7+8 = 2*1+3*3+7*1.

Constraints:
1 <= n <= 105
Number has to be non-prime!

 */