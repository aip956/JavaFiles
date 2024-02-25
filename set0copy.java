public class set0copy {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length; // num of cols
        int n = matrix[0].length; // num of rows
        int CO = 1; // flag for col 0
        // print original
        System.out.println("Input: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // next line
        }
        System.out.println(); // next line

        // 1. iterate through matrix; for each 0, make row and col at index = 0
        //   [2,1] matrix[2][0] = 0; mtx[i][0] and matrix[0][1]; mtx[0][j]
        // if [i][0] is already 0, mark flag CO = 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) {
                        CO = 0;
                    } else matrix[0][j] = 0;
                }
            }
        }
        // print after step 1
        System.out.println("After marking top col/row: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // next line
        }
        System.out.println(); // next line

        // 2. iterate through matrix; if the top row/col is 0, change to 0
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // After changing to 0
        System.out.println("After changing to 0: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // next line
        }
        System.out.println(); // next line

        // 3. If [0][0] = 0; mark top row 0; if CO = 0, mark col 0 to 0
        if(matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        if (CO == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
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
