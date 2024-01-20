import java.util.*;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Init board with dots
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        

        return result;
    }


    public static void main(String{} args) {
        int n = 4;
        System.out.println("Output: " + solveNQueens(n));

    }
}



/*
neg diag: r - c - -2, -1, 0, 1, 2; const
pos diag: r + c = constant also
cols = set; PosDiag = set; negDiag = set;




 * https://leetcode.com/problems/n-queens/
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

Example 1:
Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above

Example 2:
Input: n = 1
Output: [["Q"]]
 

Constraints:
1 <= n <= 9
 * 
 */



