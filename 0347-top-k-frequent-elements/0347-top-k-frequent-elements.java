class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //make frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        
        // fill buckets array
        List<Integer>[] buckets = new List[nums.length + 1];
        for(Integer key : freqMap.keySet()){
            int frequency = freqMap.get(key);
            
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<Integer>();
            }
            
            buckets[frequency].add(key);
        }
        
        // fill res array by iterating the buckets array
        int res[] = new int[k];
        int count = 0;
        
        for(int index = buckets.length - 1; index >= 0 && k > 0; index--){
            List<Integer> listOfKeys = buckets[index];
            if(listOfKeys == null){
                continue;
            }
            for(int listIndex = 0; listIndex < listOfKeys.size() && count < k; listIndex++){
                res[count++] = listOfKeys.get(listIndex);
            }
        }
        
        return res;
    }
}