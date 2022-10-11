class Solution {
    public int climbStairs(int n) {
        
    //declare a new array to hold our final answer -> work as a cache to store the subproblems that we have already solved
    //store the values of the first two steps since we already know what the values are for those solutions
    //iterate through a loop starting from 3 and add in the current value from the previous two values
    
    //cases to consider: if the steps are less than or equal to 2 we return that number
    //will be using extra memory to count each of the steps 
        
         if(n <= 2) return n;
        
    int array[] = new int[n + 1];
    array[1] = 1;
    array[2] = 2;
        
   
        
    for(int i = 3; i <= n; i++){
        array[i] = array[i - 1] + array[i - 2];
    }
        
        return array[n]; 
        
    }
}