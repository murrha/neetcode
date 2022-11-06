class Solution {
    public int mySqrt(int x) {
        
        /*
        my notes before solution: 
        no built-in functions 
        round down to the nearest int
        
        square root - x ^ 1/2
        
        edge cases: 0 or 1 we return the int
        
        */
        
        if(x == 0 || x == 1) return x;
        
        //binary search
        int start = 0, end = x;
        
        while(start < end){
            
            //mid point
            int mid = start + (end - start) / 2;
            
            //to prevent overflow, we use mid > x / mid
            if(mid > x / mid){
                
                //move end pointer
               end = mid - 1;
            }else{
                
                //more start pointer
                start = mid + 1;
                
                if(start > x /start){
                    return mid;
                }
                
            }

        }
        
        return start; 
    }
}