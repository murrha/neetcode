class Solution {
    
    //part 1: find the next number
    private int nextNumber(int n){
        int sum = 0;
        while(n > 0){
            
            //get the remainder of the value
            int m = n % 10;
            
            //shortens the value
            n/= 10; 
            
            //adds in the squared digit
            sum += m * m; 
        }
        
        return sum; 
}
    
    //part 2: detect if we have entered a cycle
    public boolean isHappy(int n) {
     
        /*
        approach 1: using a hashset to detect if the variable has already been included in the set or not -> return false
        */
        
        Set<Integer> set = new HashSet<Integer>();
        
        //while value isn't equal to 1 and the set hasnt encountered the variable
        while(n != 1 && !set.contains(n)){
            
            set.add(n);
            
            //calls the function to get the current sum
            n = nextNumber(n);
        }
        
        
        //boolean evaluation
        return n == 1; 
        
    }
}