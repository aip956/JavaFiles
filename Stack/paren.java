import java.util.*;
class paren {
    public boolean isValid(String s) {
        if (s.length() == 0 || s == null) return False;
        Stack <Character> stack = new Stack<>();
        for (char b : s.toCharArray()) {
            if (b == "(" || b == "{" || b == "[" ) {
                stack.push(b);
            } else if (b == ")" && stack.peek() == "(") {
                    stack.pop();
                }
                else if (b == "}" && stack.peek() == "{") {
                    stack.pop();
                }
                else if (b == "]" && stack.peek() == "[") {
                    stack.pop();
                }
            }

                    
                   
            
        }
        return True;
    }

    public static void main(String[] args) {
        String s1 =  "()";
        System.out.println(isValid(s1));
        System.out.println();
        String s21 =  "()[]{}";
        System.out.println(isValid(s2));
        System.out.println();
    }
}



/*
https://leetcode.com/problems/valid-parentheses/
for each char:
if it is an opening paren, add to stack
if it is closing, 
    return False if does not match opening
    else pop off the last char in stack
at end, stack must be empty

 * Valid Parentheses Checker
Problem Statement:
 You are given a string containing just the characters '(', ')', '{', '}', '[' and ']'. Write a function that determines if the input string has valid parentheses, meaning:
Every opening bracket has a corresponding and correctly placed closing bracket.


The brackets must be nested correctly (e.g., "(]" is invalid).


Requirements:
The function should return true if the string is valid, otherwise return false.


The function should run in O(n) time complexity and use O(n) space for the stack.


Example Cases:
Input: "()[]{}"  
Output: true  

Input: "([)]"  
Output: false  

Input: "{[]}"  
Output: true 

 */