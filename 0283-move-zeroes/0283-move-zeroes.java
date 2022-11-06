class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int count = 0;
        
        for(; index < nums.length; index ++){
            if(nums[index] != 0){
                nums[count++] = nums[index];
            }
        }
        
        while(count < nums.length){
            nums[count++] = 0;
        }
    }
}