class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        /*
        declare an array of size 2 - hold our indices whos sum is our target value
        
        from int i to nums.length - 1
            declare the difference as the element at index i - target
            set that element as our first index for our solution
            from that index to nums.length - 1
                if the element at index j equals our diff value
                set that index as our second element for our solution array
                
                
        return the array 
        
        time complexity: O(n) 
        space complexity: O(2) since those are the conditions for this solution 
        */
        
        int solution[] = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            
            
            //prevent duplicate values 
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == diff){
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        
        return solution; 
    }
}