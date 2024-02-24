import java.util.*;
public class setMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        System.out.println("3Mtx: " + matrix);
        int n = matrix.length;
        int m = matrix[0].length;
        int Col = 1;

        // Travers matrix and mark 1st row and 1st col as follows:
        for (int i = 0; i < n; i++) { // for each row
            for (int j = 0; j < m; j++) { // each column
                if (matrix[i][j] == 0) {
                    // mark ith row
                    matrix[i][0] = 0; // will mark the column of the ith row as 0
                    // mark the jth col
                    if (j == 0) Col = 0;
                    else matrix[0][j] = 0;
                }
            }
        }

        // Mark with 0 from (1,1) to (n-1, m-1):
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != 0) {
                    // Check for col & row
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // mark the 1st row then 1st col
        if (matrix[0][0] == 0) {
            Arrays.fill(matrix[0], 0);
        }
        if (Col == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }  
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix1);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}


/*
 * https://leetcode.com/problems/set-matrix-zeroes/description/
 * 
 */