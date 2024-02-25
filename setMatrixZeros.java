import java.util.*;
public class setMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int Col = 1;
        System.out.println("8, input");
        System.out.println("col: " + Col);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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
        System.out.println("21, after 1st loop");
        System.out.println("col: " + Col);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // Mark with 0 from (1,1) to (n-1, m-1):
        // start at 1,1, if each element is not 0, check if the 1st
        // row or col is 0; if so, change eleme to 0
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
        System.out.println("40, after 2nd loop");
        System.out.println("col: " + Col);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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
        // int[][] matrix1 = {{1,1,1},{1,0,1},{1,1,1}};
        // setZeroes(matrix1);
        // for (int i = 0; i < matrix1.length; i++) {
        //     for (int j = 0; j < matrix1[0].length; j++) {
        //         System.out.print(matrix1[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int[][] matrix2 = {{2,1,2,0},{0,1,5,2},{1,3,0,5}, {1,3,2,5}};
        setZeroes(matrix2);
        System.out.println("Solution:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*
 * https://leetcode.com/problems/set-matrix-zeroes/description/
 * Solution passes
 * Iterate through each element of matrix
 * If i,j = 0,
 *  Mark the first element of row i as 0
 *  Mark the first element of col j as 0
 *  Store whether first col needs to be 0'd out
 * Mark 0s
 * 
 */