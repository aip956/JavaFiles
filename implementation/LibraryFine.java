import java.util.*;


public class LibraryFine {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        // Write your code here
        if (y2 - y1 > 0) {
            return fine = 10000; 
        }
        if (m2 - m1 > 0) {
            return fine = (m2 - m1) * 500;
        }
        if (d2 - d1 > 0) {
            return fine = (d2 - d1) * 15;
        }
        return fine;
    }

    public static void main(String[] args) {
        // Returned:
        int d1 = 9;
        int m1 = 6;
        int y1 = 2015;
        // Due date:
        int d2 = 6;
        int m2 = 6; 
        int y2 = 2015;
        System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
    }
}

/*
https://www.hackerrank.com/challenges/library-fine/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * Your local library needs your help! 
 * Given the expected and actual return dates 
 * for a library book, create a program that 
 * calculates the fine (if any). 
 * 
 * The fee structure is as follows:

If the book is returned on or before the expected return date, 
no fine will be charged (i.e.: no fine).
If the book is returned after the expected return day but still 
within the same calendar month and year as the expected return date, fine = 15 Hackos x # days late.
If the book is returned after the expected return month but still 
within the same calendar year as the expected return date, the fine = 500 Hackos x # months late.
If the book is returned after the calendar year in which it was expected, 
there is a fixed fine of 1000 Hackos.
Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be .

Example


The first values are the return date and the second are the due date. The years are the same and the months are the same. The book is  days late. Return .

Function Description

Complete the libraryFine function in the editor below.

libraryFine has the following parameter(s):

d1, m1, y1: returned date day, month and year, each an integer
d2, m2, y2: due date day, month and year, each an integer
Returns

int: the amount of the fine or  if there is none
Input Format

The first line contains  space-separated integers, , denoting the respective , , and  on which the book was returned.
The second line contains  space-separated integers, , denoting the respective , , and  on which the book was due to be returned.

Constraints

Sample Input

9 6 2015
6 6 2015
Sample Output

45
Explanation

Given the following dates:
Returned: 
Due: 

Because , we know it is less than a year late.
Because , we know it's less than a month late.
Because , we know that it was returned late (but still within the same month and year).

Per the library's fee structure, we know that our fine will be . We then print the result of  as our output.
 */
