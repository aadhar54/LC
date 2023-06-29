class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(mat == null || mat.length == 0){
return mat;
        }
        
        int matRows = mat.length;
        int matCols = mat[0].length;
        
        if((matRows * matCols) != (r * c)){
            return mat;
        }
        
        int res[][] = new int[r][c];
        
        int startCol = 0;
        int startRow = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){
                
                if(startCol < c){                               res[startRow][startCol] = mat[row][col];
                    
                }else{
                    startCol = 0;
                    startRow++;
                    res[startRow][startCol] = mat[row][col];
                }
                startCol++;
            }
        }
        return res;
    }
}