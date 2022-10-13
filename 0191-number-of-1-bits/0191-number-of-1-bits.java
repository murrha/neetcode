public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        /*
        having a counter variable to track down number of 1's
        while loop to iterate through the number
            & operator to evaluate the bits since 1 & 1 = 1
            evaluting n with n - 1 to remove a bit 
            increment if there is a 1
        return counter
        */
        
        int counter = 0;
        
        while(n != 0){
            n = n & (n - 1);
            counter++;
        }
        
        return counter; 
        
    }
}