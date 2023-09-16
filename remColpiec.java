import java.util.*;

public class remColpiec {
    public static boolean winnerOfGame(String colors) {
        /* char[] colorArr = colors.toCharArray()
        if there are 3 A's, Alice can pick
            else Alice loses
            Remove an A
            iterate through the

            if there are 3 B's Bob can pick
            else he loses
            Remove middle B
        Number of As vs. Bs will determine winner
        Determine if element is A, count++
        If count > 3, countA = count-2
        reset count to 0

        for B, set count= 0;
        and Determine if elem is B, count++,
        if count > 3, countB = count -2


        */ 

        
        
        int countA = 0;
        int countB = 0;
        int pointForAlice = 0;
        int pointForBob = 0;
        char[] colArr = colors.toCharArray();

        for (char color : colArr) {
            if (color == 'A') {
                countA++;
                countB = 0;
                System.out.println("38countA: " + countA);
                if (countA >= 3) {
                    pointForAlice++;
                }
                System.out.println("42pointForAlice: " + pointForAlice);
            }
            else if (color == 'B') {
                countB++;
                countA = 0;
                System.out.println("38countB: " + countB);
                if (countB >= 3) {
                    pointForBob++;
                }
                System.out.println("42pointForBob: " + pointForBob);
            }
        }
        return pointForAlice > pointForBob;
    }


    public static void main(String[] args) {
        String colors1 = "BBAAABBABBABB";
        Boolean output1 = winnerOfGame(colors1);
        System.out.println("Output1: " + output1); // Output: 
        String colors2 = "ABBBBBBBAAA";
        Boolean output2 = winnerOfGame(colors2);
         System.out.println("Output2: " + output2); // Output: 
        String colors3 = "ABBBBBBBAAA";
        Boolean output3 = winnerOfGame(colors3);
        System.out.println("Output3: " + output3); // Output: 
    }
}
// BBBBBBB, BBBBBB, BBBBB, BBBB, BBB,


/* https://leetcode.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
 * Alice and Bob are playing a game where they take alternating turns removing pieces from the line. In this game, Alice moves first.

Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'. She is not allowed to remove pieces that are colored 'B'.
Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'. He is not allowed to remove pieces that are colored 'A'.
Alice and Bob cannot remove pieces from the edge of the line.
If a player cannot make a move on their turn, that player loses and the other player wins.
Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins.

 

Example 1:

Input: colors = "AAABABB"
Output: true
Explanation:
AAABABB -> AABABB
Alice moves first.
She removes the second 'A' from the left since that is the only 'A' whose neighbors are both 'A'.

Now it's Bob's turn.
Bob cannot make a move on his turn since there are no 'B's whose neighbors are both 'B'.
Thus, Alice wins, so return true.
Example 2:

Input: colors = "AA"
Output: false
Explanation:
Alice has her turn first.
There are only two 'A's and both are on the edge of the line, so she cannot move on her turn.
Thus, Bob wins, so return false.
Example 3:

Input: colors = "ABBBBBBBAAA"
Output: false
Explanation:
ABBBBBBBAAA -> ABBBBBBBAA
Alice moves first.
Her only option is to remove the second to last 'A' from the right.

ABBBBBBBAA -> ABBBBBBAA
Next is Bob's turn.
He has many options for which 'B' piece to remove. He can pick any.

On Alice's second turn, she has no more pieces that she can remove.
Thus, Bob wins, so return false.
 */