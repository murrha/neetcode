class Solution {
    public int lengthOfLastWord(String s) {
        
        /*
        strip the leading and trailing whitespace within the string
        finding the last index of the whitespace -> looking for the last word and we already stripped the trailing whitespace, we can easily find that last word
        substring function in the String class to find that last word then the length
        
        
        call the stripLeading method to remove the leading whitespace
        call the stripTrailing method to remove the trailing whitespace
        both will be called on the String s
        
        declare an int variable to hold the index of the last whitespace 
        declare a string to hold the last word then call the substring method using the int as the parameter + 1
        
        return the length of that last word
        
        */
        
        s = s.stripLeading();
        s = s.stripTrailing();
        
        int lastWhitespace = s.lastIndexOf(" ");
        String lastWord = s.substring(lastWhitespace + 1); 
        
        return lastWord.length(); 
        
    }
}