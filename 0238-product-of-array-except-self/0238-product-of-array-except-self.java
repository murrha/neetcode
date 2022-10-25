class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int result[] = new int[nums.length];
        
        //postfix and prefix
        int right = 1, left = 1;
        
        //for getting values after nums[i]
        for(int i = 0; i < nums.length; i++){
            
            //will set the prefix as 1
            result[i] = left;
            
            //left will be updated with product from the right side
            left *= nums[i];
        }
        
        //for getting values before nums[i]
        for(int i = nums.length - 1; i >= 0; i--){
            
            //will only be multiplied by 1 since we already have the values from before
            result[i] *= right;
            
            //right will be updated to the products from before
            right *= nums[i];
        }
        
        return result; 
        
    }
}