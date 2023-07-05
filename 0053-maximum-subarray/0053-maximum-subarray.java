class Solution {
    public int maxSubArray(int[] nums) {
        int sum_till_current_index = 0;
        int max = Integer.MIN_VALUE;
        
        for(int index = 0; index < nums.length; index++){
            sum_till_current_index+= nums[index];
            
            if(sum_till_current_index > max){
                max = sum_till_current_index;
            }
            
            if(sum_till_current_index < 0){
                sum_till_current_index = 0;
            }
        }
        return max;
    }
}