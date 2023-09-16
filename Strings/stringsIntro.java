package Strings;

import java.util.*;

public class stringsIntro {
    public static void strings(String A, String B) {
    System.out.println(A.length() + B.length());
        if (A.compareTo(B) <= 1) {
            System.out.println("No");
        } else {System.out.println("Yes");}
        String firstletterA = A.substring(0,1);
        firstletterA = firstletterA.toUpperCase();
        String firstletterB = B.substring(0,1);
        firstletterB = firstletterB.toUpperCase();
        String restOfA = A.substring(1);
        String restOfB = B.substring(1);
        System.out.println(firstletterA+restOfA+" "+firstletterB+restOfB);
    }    
    public static void main(String[] args) {
        String A = "hello";
        String B = "world";
        strings(A, B);
    }
}


/*
https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
 */