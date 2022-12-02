class Solution {
    
    public int[] decompressRLElist(int[] nums) {
        
        //size of the new array
        int size = 0;
        
        //loop through the array every 2 spots
        for(int i = 0; i < nums.length; i+=2){
            
            //summation of the frequencies in the array
            //assign it to the size
            size += nums[i]; 
        }
        
        //declare a new array for the result
        int[] result = new int[size];
        
        //declare a tracking variable
        int tracker = 0;
        
        //loop through array every 2 spots
        for(int i = 0; i < nums.length; i+=2){
            
            //utilize Arrays.fill() method
            Arrays.fill(result, tracker, tracker + nums[i], nums[i + 1]);
            
            //moves tracker to the next spot
            tracker += nums[i]; 
        }
        
        return result; 
}
}