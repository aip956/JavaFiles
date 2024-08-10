import java.io.*;

class Solution {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // swap the elements
                System.out.println("matrix[i][j] " + matrix[i][j]);
                System.out.println("matrix[j][i]" + matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            System.out.println("13Matrix:");
            printMatrix(matrix);
        }

        // reverse the rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j-1];
                matrix[i][n - j - 1] = temp;
            }
            System.out.println("23Matrix:");
            printMatrix(matrix);
            
        }
        System.out.println("25Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
    }
}



