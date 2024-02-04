import java.util.*;

public class gameSegments {
    public static int playSegments(List<Integer> coins) {
        int segments = 0;
        System.out.println("coins: " + coins);
        
        return segments;
    }

    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1,1,0,1);
        System.out.println(playSegments(coins));
    }
}


/*
 * A video game dev is developing a game in which the character makes their way through several segments of a level. In each segment, if the character collects a coin, the player scores a point. However, if a segment does not contain a count, the player loses a point. Player 1 always begins the level, and at some point, game play is turned over to player 2 to complete the level. Player 1’s goal is to achieve a higher score than player 2 once he  level is completed. Given the status of tame segments, determine the minimum number of segments player 1 should play so that in the end their score is greater than player 2’s score

Ex:
Segments [1,1,0,1]
Player 1 has the following options:
Play 0 segments, this would give them a score of 0. Player 2 would have a score of 3-1=2 because they gain a point for each of the 3 segments with a coin and lose 1 point for the segment without a coin
Play 1 segment; this would give them a score of 1. Player 2 would have a score of 2-1=1
Play 2 segments. This would give them a score of 2. Player 2 would have a score of 1-1=0

Only in this last case by playing 2 segments would player 1s score be greater than p2’s therefore return the answer 2.

Public static int playSegments(List<Integer> coins)

 */
