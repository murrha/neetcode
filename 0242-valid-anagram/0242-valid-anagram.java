class Solution {
    public boolean isAnagram(String s, String t) {
        
        /*
        if s and t are of the same length -> return false if different lengths
        
        string = an array of characters
        array to hold all letters of alphabet -> create an array of size 26
        
        iterate through the array 
            get the ascii value of string s for that character in index i++
            get the ascii value of string t for that character in index i--
        
        for(int i: alphabet){
        if(i != 0){
        return false;
        }
        }
        
        return true
        
        TC: O(n) - iterating through the string of same size n
        SP: O(n) - creating the alphabet bucket of size n
            
        
        */
        
        if(s.length() != t.length()) return false;
        
        int alphabet[] = new int[26];
        
        
        for(int i = 0; i < s.length(); i++){
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--; 
        }
        
        for(int i: alphabet){
            if(i != 0){
                return false;
            }
        }
        
        return true; 
    }
}