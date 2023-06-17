class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0){
            return triangle;
        }
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        
        triangle.add(first_row);
        
        for(int row = 1; row < numRows; row++){
            
            List<Integer> prevRow = triangle.get(row - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            
            for(int col = 1; col <= row -1; col++){
                newRow.add(prevRow.get(col -1) + prevRow.get(col));
            }
            
            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
    }
}