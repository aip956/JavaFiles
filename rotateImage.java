import java.io.*;

class Solution {
    public static void rotate(int[][] matrix) {
        int n = length(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // swap the elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            System.out.println("13Matrix: " + matrix);
        }

        // reverse the rows
        for (int i = 0; i < n; i++) {
            
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(rotate(matrix));
    }
}



