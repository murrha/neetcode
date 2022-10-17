class Solution {
    public int missingNumber(int[] nums) {
        
        //set the sume as the lenght of the array
        int sum = nums.length;
        
        //iterate through the array
        for(int i = 0; i < nums.length; i++){
            
            //sum will adding in the difference of the index and the element
            //ideally, the difference should be 0 but the element that's not included will be set as the value of sum
            sum += i - nums[i];
        }
        
        return sum;
    }
}