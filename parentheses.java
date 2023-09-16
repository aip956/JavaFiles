import java.util.*;

public class parentheses {
    static boolean ispar(String x)
    {
        // add your code here
        // int len = String.length();
        Stack <Character> stack = new Stack<Character>();
        for (int i = 0; i < x.length(); i++ ) {
            x.charAt(i);
            if (x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[') {
                stack.push(x.charAt(i));
            }
            else if (x.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.lastElement() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
                
            }
            else if (x.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.lastElement() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
                
            }
            else if (x.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.lastElement() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }



    public static void main(String[] args) {
        // String n = "{([])}";
        // String n = "()";
        // String n = "([]";
        String n = ")";

        boolean output = ispar(n);
        System.out.println("Output: " + output); // Output: 
    }
}


/*
 * https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&difficulty[]=0&sortBy=submissions
 * Parenthesis Checker
EasyAccuracy: 28.56%Submissions: 487K+Points: 2
Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balanced pairs, with 0 number of 
unbalanced bracket.
Example 2:

Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.
Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.
Your Task:
This is a function problem. You only need to complete the function ispar() that takes a string as a parameter and returns a boolean value true if brackets are balanced else returns false. The printing is done automatically by the driver code.

Expected Time Complexity: O(|x|)
Expected Auixilliary Space: O(|x|)

Constraints:
1 ≤ |x| ≤ 32000
 */