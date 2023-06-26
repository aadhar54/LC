class Solution {
    public int countNegatives(int[][] grid) {
        if(grid == null){
            return 0;
        }
        if(grid.length == 0){
            return 0;
        }
        int totalCols = grid[0].length;
        int startRow = grid.length - 1;
        int startCol = 0;
        int ans = 0;
        while(startRow >= 0 && startCol < totalCols){
            if((startCol == totalCols - 1) && grid[startRow][startCol] >= 0){
                return ans;
            }
            if(grid[startRow][startCol] < 0){
                ans = ans + totalCols - startCol;
                startRow--;
            }else{
                startCol++;
            }
        }
        return ans;
    }
}