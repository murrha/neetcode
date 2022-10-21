class Solution {
    public boolean isPalindrome(String s) {
        
        /*
        assume that we have to manually convert to lower case and remove all nonalphanumeric characters, remove spaces
        empty strings are considered a palindrome
        
        *this method doesn't remove spaces or nonalphanumeric character - it just checks for matching characters on either side 
        
        two pointer approach to trach each characters iterated
        Character.isLetterOrDigit(char c) -> if it's true then we can increment or decrement
        
        two integer values that would increment and decrement 
        
        while start <= end
            check if the head isn't a letter or digit -> space, nonalphanum
                increment head
            else if the tail isn't a letter or digit
                decrement tail
            else -> reach a character value
                if head and tail do not match
                    return false
                increment head
                decrement tail
        endwhile
        
        return true
        
        TC: O(n) - iterating through the string
        SP: O(1) - not creating new data structures
        
        */
        
        
        if(s.length() == 0) return true;
        
        
        int start = 0;
        int end = s.length() - 1;
        
        
        
        while(start <= end){
            
            char head = s.charAt(start);
            char tail = s.charAt(end);
            
            if(!Character.isLetterOrDigit(head)){
                start++;
            }
            else if(!Character.isLetterOrDigit(tail)){
                end--;
            }
            else{
                if(Character.toLowerCase(head) != Character.toLowerCase(tail)){
                    return false;
                }
                
                start++;
                end--;
            }
        }//endwhile
        
        return true; 
    }
}