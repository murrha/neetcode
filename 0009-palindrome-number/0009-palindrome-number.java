class Solution {
    public boolean isPalindrome(int x) {
        
        /*
        follow up - don't convert to a string
        
        palindrome - same amount of each digit
        negative values won't be a palindrome because of the negative sign -> anything less than 0 is returned false
        also numbers ending in 0 don't count
        */
        
        if(x < 0 || (x % 10 == 0 && x != 0)) return false; 
        
        int rev = 0;
        while(x > rev){
            
            //gives us the half of the number
            rev = rev * 10 + x % 10;
            
            
            x /= 10;
        }
        
        //gets rid of the middle digit
        return x == rev || x == rev/10; 
        
    }
}