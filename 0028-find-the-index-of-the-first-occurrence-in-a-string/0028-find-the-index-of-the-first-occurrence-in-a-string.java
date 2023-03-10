class Solution {
    public int strStr(String haystack, String needle) {
        
        /*
        needle and haystack are two variables that each hold a string
        return the index of the first occurence of needle in haystack
        else return -1
        
        look an exact match of the string in needle in haystack
        but only return the first occurence we see of it 
        
        String methods - contains, indexOf
        
        contains - see if there exists a needle in the haystack -> return -1 if the boolean return false
        
        else we use indexOf to find the first occurance of the needle
        */
        
        if(!haystack.contains(needle)) return -1;
        
        return haystack.indexOf(needle); 
    }
}