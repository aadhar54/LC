class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(mat == null || mat.length == 0){
            return mat;
        }
        int realRows = mat.length;
        int realCols = mat[0].length;
        
        if((realRows * realCols) != (r * c)){
            return mat;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int row = 0; row < realRows; row++){
            for(int col = 0; col < realCols; col++){
                list.add(mat[row][col]);
            }
        }
        
        int[][] res = new int[r][c];
        int index = 0;
        for(int row = 0; row < r; row++){
            for(int col = 0; col < c; col++){
                res[row][col] = list.get(index);
                index++;
}
        }
        
        return res;
        
    }
}