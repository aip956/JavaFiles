
/*
https://leetcode.com/problems/delete-greatest-value-in-each-row/submissions/
time complex: O(m * n^2); 
    outer while loop runs for n iters
    middle for loop iter through all rows m
    innermost for loop iters through all n to find max
    three nested loops


Space complex: O(1); not using any additional data strcts that grow w input size
while numb of cols in row > 0
iterate through all rows
iterate through each row
find row max
find array max
iterate through row and delete max by moving rest of cols to left
do same for other rows
decrement num of cols in row

 */



class delGrtValEachRow {
    public static int deleteGreatestValue(int[][] grid) {
        int m = grid.length; // 2; num of rows
        int n = grid[0].length; // 3; row length, num of cols
        System.out.println("26n: " + n);
        int summedMax = 0;
        // iterate through each subArrs
        while (n > 0)  { // for both rows
            int arrMax = -1; // max between subArrs
            
            for (int i = 0; i < m; i++) { // for both rows
                int subArrMax = -1; // max within this subarray
                for (int j = 0; j < n; j++) { // for one row, find max of row and arrMax
                    System.out.println("35n: " + n);
                    subArrMax = Math.max(subArrMax, grid[i][j]);
                    System.out.println("i: " + i + ", j: " + j + " , subArrMax: " + subArrMax);
                    arrMax = Math.max(arrMax, subArrMax);
                    System.out.println("i: " + i + ", j: " + j + " , arrMax: " + arrMax);
                }
                System.out.println("40arrMax: " + arrMax);

                
                    // go back through row; find subArrMax and shift elements after to left
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == subArrMax) {
                        for (int k = j; k < n - 1; k++) {
                            grid[i][k] = grid[i][k+1];
                        }
                        
                        break;
                    }
                }
                
            }// for row
            n--;
            summedMax += arrMax;
            System.out.println("42summedMax: " + summedMax);
        } // while
        System.out.println("44summedMax: " + summedMax);
        return summedMax;
    }


    public static void main(String[] args) {
        // int[][] grid = {{1,2,4}, {3,3,1}};
        // int output = deleteGreatestValue(grid);
        // System.out.println(output);
        int[][] grid2 = {{10}};
        int output2 = deleteGreatestValue(grid2);
        System.out.println(output2);
    }
}