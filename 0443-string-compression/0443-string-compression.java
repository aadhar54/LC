class Solution {
    public int compress(char[] chars) {
        int newLength = 0;
        int i = 0;
        while(i < chars.length){
            chars[newLength++] = chars[i];
            int j = i;
            while(j < chars.length && chars[j] == chars[i]){
                j++;
            }
            if(j - i > 1){
                String count = j - i +"";
                for(char ch : count.toCharArray()){
                    chars[newLength++] = ch;
                }
            }
            
            i = j;             
        }
        return newLength;
    }
}