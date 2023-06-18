/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
      if(nums == null){
          return nums;
      }
    
      if(nums.length== 0){
          return nums;
      }
    
      if(nums.length == 1){
          return nums[0];
      }
    
    let ans = 0;
    for(let index = 0; index < nums.length; index++){
        ans = ans ^ nums[index];
    }
    
    return ans;
    
};


// 1 2 1

// ans = 0

// ans = 0 ^ 1 ^ 2 ^ 1 = 0 ^2 = 2

