class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat ==null){
            return 0;
        }
        if(mat.length == 0){
            return 0;
        }
        
        int diagSum = 0;
        int last_col = mat.length - 1;
        for(int row = 0; row < mat.length; row++){
            diagSum+= mat[row][last_col];
            last_col--;
            diagSum+= mat[row][row];
        }
        
        
        if(mat.length % 2 == 1){
            int tot_rows = mat.length;
            int tot_cols = mat[0].length;
            int mid_row = tot_rows/2;
            int mid_col = tot_cols/2;
            
            diagSum-= mat[mid_row][mid_col];
        }
        return diagSum;
    }
}