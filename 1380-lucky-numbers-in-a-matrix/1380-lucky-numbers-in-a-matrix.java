class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int row = 0; row <matrix.length; row++){
            int min_row_element = Integer.MAX_VALUE;
            int min_row_element_col_index = 0;
            for(int col = 0; col <matrix[row].length; col++){
                if(matrix[row][col] < min_row_element){
                    min_row_element = matrix[row][col];
                    min_row_element_col_index = col;
                }
            }
            
            //check by comparing element with all elemetns of column
            boolean isLucky = true;
            for(int krow = 0; krow < matrix.length; krow++){
                if(matrix[krow][min_row_element_col_index] > min_row_element){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky){
                result.add(min_row_element);
            }
        }
        return result;
    }
}