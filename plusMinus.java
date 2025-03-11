import java.util.*;

class plusMinus {
    static void plusMinus(List<Integer> arr) {
        int neg = 0;
        int zero = 0;
        int pos = 0;
        int len = arr.size();
        for (int num : arr) {
            if (num < 0) neg++;
            else if (num == 0) zero++;
            else if (num > 0) pos++;
        }
        System.out.printf("%.6f%n", (double) neg / len);
        System.out.printf("%.6f%n", (double) zero / len);
        System.out.printf("%.6f%n", (double) pos / len);
    }


    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 0, -1, -1));
        plusMinus(arr);
    }
    
}







/*
 * https://www.hackerrank.com/challenges/plus-minus/problem
 * HackerRank Home
|
Given an array of integers, calculate the ratios of its elements that are
 positive, negative, zero. Print the decimal value of each fraction on a 
 new line with 6 places after the decimal.

Note: This challenge introduces precision problems. 
The test cases are scaled to six decimal places, 
though answers with absolute error of up to  are acceptable.

Example
arr = [1, 1, 0, -1, -1]
There are  elements: two positive, two negative and one zero. 
Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000
Function Description

Complete the  function with the following parameter(s):

: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe .

Constraints



Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array.
The proportions of occurrence are positive: , negative:  and zeros: .

Language
C++11
More
123456789101112131415161718

    return tokens;
}

Line: 82 Col: 1


 */