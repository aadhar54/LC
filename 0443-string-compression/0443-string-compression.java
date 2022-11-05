class Solution {
    public int compress(char[] chars) {
        String resString = "";
        
        for(int i =0; i < chars.length ; ){
            
            int j = i+1;
            for(; j < chars.length && chars[j] == chars[i];j++){
                
            }
            
            int count = j - i;
            if(count>1){
                resString+= chars[i] +""+ count +"";
            }
            else{
                resString+= chars[i] +"";
            }
             i = j;
        }
        
        int index = 0;
        for(char c : resString.toCharArray()){
            chars[index++] = c;
        }
        return index;
    }
}