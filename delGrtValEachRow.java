
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
        int m = grid.length; // 2
        int n = grid[0].length; // 3
        int summedMax = 0;

        int arrMax = -1; // max between subArrs

    // iterate through each subArrs
    for (int i = 0; i < n; i++)  { // for both rows
        int subArrMax = -1; // max within this subarray
        System.out.println("i: " + i );
        for (int j = 0; j < m; j++) { // for one row
            subArrMax = Math.max(subArrMax, grid[i][j]);
            System.out.println("i,j,subArrMax: " + i + " "+ j + " " + subArrMax);
            arrMax = Math.max(arrMax, subArrMax);
            System.out.println("i,j,arrMax: " + i + " "+ j + " " + arrMax);
        }
        System.out.println("40arrMax: " + arrMax);
        summedMax += arrMax;
        System.out.println("42summedMax: " + summedMax);
    }
        System.out.println("44summedMax: " + summedMax);
        return summedMax;
        
  }

    public static int[] removeElem (int[] row, int elem) {
        int[] newRow = new int[row.length - 1];
        int index = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] != elem) {
                newRow[index] = row[i];
                index++;
            }
        }
        return newRow;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,4}, {3,3,1}};
        int output = deleteGreatestValue(grid);
        System.out.println(output);
    }

}