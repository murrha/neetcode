class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        /*
        are the prefixes of a specific kind of length? -> assume that there are no limits
        ['the', 'there', 'they'] -> the
        if there are no matches, then return an empty string
        */
        
        if(strs == null || strs.length == 0) return "";
        
        //iterate through length of the first string
        for(int i = 0; i < strs[0].length(); i++){
            
            //create a character that will hold the character of the first string in array
            char c = strs[0].charAt(i);
            
            //continue from there
            for(int j = 1; j < strs.length; j++){
                
                //if the second string is short or if it doesn't match the character from i
                if(i == strs[j].length() || strs[j].charAt(i) != c)
                    
                    //will return the substring from the first string
                    return strs[0].substring(0, i);
            }
        }
        
        return strs[0]; 
    }
}