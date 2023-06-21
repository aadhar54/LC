class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicatesList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            int currFreq = map.getOrDefault(num, 0);
            if(currFreq == 1){
                duplicatesList.add(num);
            }
            map.put(num, currFreq + 1);
        }
        return duplicatesList;
    }
}