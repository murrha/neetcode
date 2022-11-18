class Solution {
    
    private int divide(int dividend, int divisor){
            while(dividend % divisor == 0){
                dividend /= divisor; 
                ;
            }
        return dividend; 
    }
    
    public boolean isUgly(int n) {
        /*
        factors -> numbers that are multiplied 
        
        if the integer has factors that are 2, 3, or 5 it's an ugly number
        
        special case: 1 -> no prime factors so limited to those three stated in the problem
        
        the integer can't contain other prime facotrs
        
        
        */
        
        if(n <= 0) return false;
        
        for(int factor: new int[] {2, 3, 5}){
            n = divide(n, factor);
        }
        
        return n == 1; 
    }
}