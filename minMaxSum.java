import java.util.*;

public class minMaxSum{
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long min = 0;
    long max = 0;
    System.out.println("size: " + arr.size());
    for (int i = 0; i <= arr.size() - 2; i++) {
        min += arr.get(i);
        // System.out.println("i: " + i);
        // System.out.println("arr.get(i): " + arr.get(i));
    }
    max = min - arr.get(0) + arr.get(arr.size() - 1);
    System.out.println(min + " " + max);

    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        miniMaxSum(arr);
    }
}



/*
 * Given five positive integers, find the minimum and maximum
 *  values that can be calculated by summing exactly four of 
 * the five integers. Then print the respective minimum and 
 * maximum values as a single line of two space-separated 
 * long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the  function with the following parameter(s):

: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.No value should be returned.

Note For some languages, like C, C++, and Java, the sums may require that you use a long integer due to their size.

Input Format

A single line of five space-separated integers.

Constraints


Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Hints: Beware of integer overflow! Use a 64-bit integer to store the sums.
 */