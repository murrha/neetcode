class Solution {
    public int search(int[] nums, int target) {
        
        /*
        
        binary search is best utilized for an array that is sorted
        since it's sorted for us, we have to divide it in half and get the target value
        we search left if it's less than the target
        we search right if it's greater than the target
        we return the index if the element matches with target
        if all else fails return -1
        
        
        declare three variables
       
        start = 0
        end = nums.length - 1
        
        while(start <= end)
        
            middle = (start + end) / 2
            if the middle equals the target 
                return middle
            else if the middle is < target
                increment start 
            else
                decrement end
                
        if all else fails return -1 
        
        */
        
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            
            int middle = (start + end) / 2;
            
            if(nums[middle] == target){
                return middle;
            } else if(nums[middle] < target){
                start++;
            } else end--;
        }
        
        return -1; 
    }
}