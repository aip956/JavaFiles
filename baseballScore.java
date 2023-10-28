import java.util.*;


public class baseballScore {
    public static int keepScore(String[] ops) {
        List<Integer> scores = new ArrayList<>();

        for (String elem : ops) {
            int length = scores.size();
            System.out.println("10elem: " + elem);
            switch(elem) {
                case "C": // pop or remove()
                    scores.remove(length-1);
                break;
                case "D": // double prev score
                    scores.add(Integer.valueOf(scores.get(length-1) * 2));
                break;
                case "+": // add last 2 elems
                    scores.add(Integer.valueOf(scores.get(length - 1)) + Integer.valueOf(scores.get(length - 2)));
                break;
                default: 
                    scores.add(Integer.valueOf(elem));
                break;
                
            }
            System.out.println(scores);
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }




    public static void main (String[] args) {
        String[] ops1 = {"5","2","C","D","+"};
        String[] ops2 = {"5","-2","4","C","D","9","+","+"};
        String[] ops3 = {"1","C"};
        System.out.println("Score1: " + keepScore(ops1));   
        System.out.println("Score2: " + keepScore(ops2));  
        System.out.println("Score3: " + keepScore(ops3));  
    }
    
}

/*

input: array
output: integer
score array: need to record ongoing scores: stack?

Switch:
integer:
+: sum last two elements of score
D: double previous score; newElem = score[-1]*2; push newElem
C: invalidate previous score; pop from array" 





You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:
An integer x - Record a new score of x.
"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
Return the sum of all the scores on the record. The test cases are generated so that the answer fits in a 32-bit integer.
Example 1:
Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
Example 2:
Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation:
"5" - Add 5 to the record, record is now [5].
"-2" - Add -2 to the record, record is now [5, -2].
"4" - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
"9" - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
Example 3:
Input: ops = ["1","C"]
Output: 0
Explanation:
"1" - Add 1 to the record, record is now [1].
"C" - Invalidate and remove the previous score, record is now [].
Since the record is empty, the total sum is 0.
Constraints:
1 <= ops.length <= 1000
ops[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
For operation "+", there will always be at least two previous scores on the record.
For operations "C" and "D", there will always be at least one previous score on the record.

*/
