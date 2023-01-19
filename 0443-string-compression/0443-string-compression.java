class Solution {
    public int compress(char[] chars) {
        int count = 1;
        String temp = chars[0] + "";
        for(int index = 1; index < chars.length; index++){
            char currChar = chars[index];
            char prevChar = chars[index - 1];
            
            if(currChar == prevChar){
                count++;
            }else{
                if(count > 1){
                    temp+= count;
                }
                temp+= currChar;
                count = 1;
                
            }
            
        }
        
        if(count > 1){
            temp+= count;
        }

        
        for(int index = 0; index < temp.length(); index++){
             chars[index] = temp.charAt(index);
        }
        
        
        return temp.length();
    }
}