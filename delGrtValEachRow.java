
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
        int m = grid.length;
        int n = grid[0].length;
        int summedMaxs = 0;


    // iterate through each subArrs
    for (int i = 0; i < n; i++)  { // for both rows
        int colMax = -1; // max between subArrs
        int subArrMax = -1; // max within this subarray
        for (int j = 0; j < m; j++) { // for one row
            
            subArrMax = Math.max(subArrMax, grid[j][i]);
            colMax = Math.max(colMax, subArrMax);
        }





    }
        
        System.out.println("8grid[0]len: " + grid[0].length);
        for (int i = 0; i < grid.length; i++) {
            System.out.println("i: "+ i);
            
            int subArrMax = 0;
            int subArrMaxInd = 0;
        
        //System.out.println("i's length: "+ grid[i].length);
        // iterate within subArr
        for (int j = 0; j < grid[i].length; j++) {
            
            subArrMax = Math.max(subArrMax, grid[i][j]);
            subArrMaxInd = j;
            System.out.println("j: "+ j);
            System.out.println("19subArrMax: "+ subArrMax);
            
        }
        // remove subArrMax from subarray; add the max to summedMax
        
        System.out.println("24max of iteration: " + max);
        grid[i] = removeElem(grid[i], subArrMax);
        summedMaxs += max;
        System.out.println("27MAX: " + max);
        System.out.println("28grid[0]len: " + grid[0].length);
        }
    //System.out.println("grid: " + grid[0][1]);//

    }
    return summedMaxs;
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