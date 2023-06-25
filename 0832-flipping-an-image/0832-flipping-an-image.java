class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        if(image == null){
            return image;
        }
        if(image.length == 0){
            return image;
        }
        flip(image);
        invert(image);
        return image;
        
    }
    
    private static void flip(int [][] image){
        int[][] temp = new int[image.length][image[0].length];
        
        for(int row = 0; row < image.length; row++){
            int tempCol = temp[row].length -1;
            for(int col = 0; col < image[row].length; col++){
              temp[row][tempCol] = image[row][col];
                tempCol--;
            }
        }
        
        transferToImage(temp, image);
        
    }
    private static void invert(int[][] image){        
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){
                int currEl =                 image[row][col];
                image[row][col] = (currEl == 1) ? 0 : 1;
            }
        }

        
    }
        private static void transferToImage(int[][] temp, int[][] image){
                   for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[row].length; col++){
        image[row][col] = temp[row][col];
            }
        }
    }
 
        
}