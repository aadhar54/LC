class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int index1 = 0; index1 < nums.length; index1++){
            int complement = target - nums[index1];
            
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), index1};
            }
            
            map.put(nums[index1], index1);
        }
        
        return new int[2];
        
    }
}