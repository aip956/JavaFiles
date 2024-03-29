public class reachingPoints {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        // while destination is still greater than origin
        // terminates when either origin xy passes destin xy
        while (tx >= sx && ty >= sy) {
            System.out.println("5sx: " + sx);
            System.out.println("6sy: " + sy);
            System.out.println("7tx: " + tx);
            System.out.println("8ty: " + ty);
            if (tx == sx && ty == sy) {
                return true;
            }
            // if destin x > y, if destin x > origin x; modul
            if (tx > ty) {
                System.out.println("15tx: " + tx + ", ty: " + ty);
                if (ty > sy) {
                    tx %= ty; // equiv of subtracting multiples of ty from tx
                    System.out.println("18tx: " + tx);
                } else {
                    System.out.println("20");
                    return (tx - sx) % ty == 0;
                }
            } else {
                if (tx > sx) {
                    System.out.println("25tx: " + tx + ", sx: " + sx);
                    ty %= tx;
                    System.out.println("27ty: " + ty);
                } else {
                    System.out.println("29");
                    return (ty - sy) % tx == 0;
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        reachingPoints solution = new reachingPoints();
        System.out.println(solution.reachingPoints(1, 1, 3, 5));  // Output: true
        // System.out.println(solution.reachingPoints(1, 1, 2, 2));  // Output: false
        // System.out.println(solution.reachingPoints(1, 1, 1, 1));  // Output: true
        // System.out.println(solution.reachingPoints(1, 1, 1000000000, 1));  // Output: true
    }
}


/* 
780. Reaching Points
Hard
1.3K
215
Companies
Given four integers sx, sy, tx, and ty, return true if it is possible to convert the point (sx, sy) to the point (tx, ty) through some operations, or false otherwise.

The allowed operation on some point (x, y) is to convert it to either (x, x + y) or (x + y, y).

 

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

1 <= sx, sy, tx, ty <= 109 */