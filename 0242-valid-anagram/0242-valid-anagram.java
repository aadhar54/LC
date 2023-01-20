class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[256];
        
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        
        for(char ch : t.toCharArray()){
            freq[ch]--;
        }
        
        for(int num : freq){
            if(num != 0){
                return false;
            }
        }
        
        return true;
    }
}