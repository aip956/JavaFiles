class reachingPts {
    public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == sx && ty == sy) return true;
        
            if (tx > ty) {
                if (ty > sy) {
                    tx %= ty;
                } else {
                    return (tx - sx) % ty == 0;
                }
            } else {
                if (tx > sx) {
                    ty %= tx;
                } else {
                    return (ty - sy) % tx == 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Output1: " + reachingPoints(1, 1, 3, 5)); // true
        System.out.println("Output2: " + reachingPoints(1, 1, 100, 200)); // false
    }
}





/*
 * Work from target to start
 * https://leetcode.com/problems/reaching-points/description/
 * 
780. Reaching Points

Given four integers sx, sy, tx, and ty, return true if it is 
possible to convert the point (sx, sy) to the point (tx, ty) 
through some operations, or false otherwise.

The allowed operation on some point (x, y) is to convert it to 
either (x, x + y) or (x + y, y).
While target >= source
Source = (2, 5), Target = (19, 12)
If target's x > y, we had to use the (x+y, y)
if tx > ty: tx -= ty
else ty > tx: ty -=tx
19, 12: tx > ty -> tx -= ty -> 19-12, 12 -> 7,12
7, 12: ty > tx -> ty -= tx -> 7, 12-7 -> 7,5
7, 5: tx>ty -> tx -= ty -> 2, 5
But this is time long
Could instead:
tx > ty: tx %= ty -> 19 %= 12 = 7,12
ty > tx: ty %= tx -> 7,5
tx > ty: tx %= ty -> 2,5
but % can return 0
so if the target x or y == source x or y, focus on the other


Example 1:
Input: sx = 1, sy = 1, tx = 3, ty = 5
Output: true
Explanation:
One series of moves that transforms the starting point to the target is:
(1, 1) -> (1, 2)
(1, 2) -> (3, 2)
(3, 2) -> (3, 5)

Example 2:
Input: sx = 1, sy = 1, tx = 2, ty = 2
Output: false

Example 3:
Input: sx = 1, sy = 1, tx = 1, ty = 1
Output: true
 
Constraints:

1 <= sx, sy, tx, ty <= 109
 */