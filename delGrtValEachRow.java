
/*

 subArr i = 0
    int colMax = 0
    find subArrMax; 4
    subArrMaxInd
    max = 4
 subArr i = 1
    find subArrMax; 3
    max = Math.max(colMax, max)
    max still 4;
find max of subArrs = 4
remove 4 from subArr i = 0
remove 3 from subArr i = 1
maxSum += max;
subArr lenghth is less one
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
            // iterate through row
            for (int i = 0; i < m; i++) {
                int subArrMax = -1; // max within this subarray
                for (int j = 0; j < n; j++) { // for one row
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
        int[][] grid = {{1,2,4}, {3,3,1}};
        int output = deleteGreatestValue(grid);
        System.out.println(output);
    }
}