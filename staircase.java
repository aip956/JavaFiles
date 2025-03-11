
public class staircase {
    public static void staircase(int n) {
        String space = " ";
        String pound = "#";
        for (int i = 1; i <= n; i++) {
            System.out.print(space.repeat(n - i) + pound.repeat(i));
            System.out.println();
            // i = 1, space repeats 5-1 = 4, pound repeats 1
            // i = 2; space repeats 5-2 = 3, pound repeats 2
        }
    }

    public static void main(String[] args) {
        int n = 5;
        staircase(n);

    }


}



/*
for each row less than n, print spaces, then n
for n = 4, 
print 3 " " + "#"; int space = n - i, pound starts at 1
use string.repeat(n) to print a string n times
print 

https://www.hackerrank.com/challenges/staircase/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

 * Staircase detail

This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to . 
It is drawn using # symbols and spaces. 
The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the  function with the following parameter(s):

int n: an integer
Print

Print a staircase as described above. No value should be returned.
Note: The last line is not preceded by spaces. All lines are right-aligned.

Input Format

A single integer, , denoting the size of the staircase.

Constraints

 .

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
 * 
 */