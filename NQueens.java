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
        solve(0, board, result);
            
        return result;        
    }

    public static void solve(int row, char[][] board, List<List<String>> result) {
        if (row == board.length) {
            result.add(constructSolution(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isValidPlacement(board, row, col)) {
                board[row][col] = 'Q';
                solve(row + 1, board, result);
                board[row][col] = '.';
            }
        }
    }



    private boolean isValidPlacement(char[][] board, int row, int col) {
        // Check that no queens attack horiz, vertic, diagon
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q' || (col - row + i >= 0 && board[i][col - row + i] == 'Q') || (col + row - i < board.length && board[i][col + row - i] == 'Q')) {
                return false;
            }
        }
        return true;
    }

    private List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }


    public static void main(String[] args) {
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



