class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Set<Integer> set = new HashSet();
        
//         for(int num : nums){
//             if(!set.add(num)){
//                 return true;
//             }
//         }
        
//         return false;
        
        Arrays.sort(nums);
        for(int index = 0; index < nums.length - 1; index++){
            if(nums[index] == nums[index + 1]){
                return true;
            }
        }
        return false;
    }
}