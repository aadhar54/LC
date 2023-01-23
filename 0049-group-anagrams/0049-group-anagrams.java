class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] strCharArray = str.toCharArray();
            Arrays.sort(strCharArray);
            String sotedString = String.valueOf(strCharArray);
            
            if(map.containsKey(sotedString)){
                map.get(sotedString).add(str);
            }else{
                map.put(sotedString, new ArrayList<String>(Arrays.asList(str)));
            }
            
        }
        
        return new ArrayList<>(map.values());
        
    }
}