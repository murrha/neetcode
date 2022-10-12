class Solution {
    public int[] plusOne(int[] digits) {
        
        //if the last digit is less than 9, all we have to do is to increment that digit and return the array
        
        //if the last digit is 9, then we have to create a new array with a leading bit that is placed as the new head
        
        /*
        for int i from digits.length - 1 
            check if the last digit is less than 9
                increment that digit
                return the array
                
            set the last digit as 0
            
        
        create a new array that is one size greater than the current array
        the first element of that array will be 1
        
        return that new array
            
        tc: O(n) - iterating through array
        sp: O(1) - no extra memory
        */
        
        
        for(int i = digits.length - 1; i >= 0; i--){
            
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int newArray[] = new int[digits.length + 1];
        newArray[0] = 1;
        
        return newArray; 
    }
}