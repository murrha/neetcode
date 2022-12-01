class Solution {
    
    //serves as some kind of dictionary to refer to
    String vowels = "aeiouAEIOU"; 
    
    public boolean halvesAreAlike(String s) {
        
        //check if it's even
        if(s.length() % 2 != 0) return false;
        
        int mid = s.length() / 2;
        int answer = 0; 
        
        //two loops going on
        //i will reach the mid point -> first half
        //j will iterate through the second half
        //need only one conditional since both sides are of the same length -> even length string
        for(int i = 0, j = mid; i < mid; i++, j++){
            
            //will call the string vowels and returns int of the first position of a vowel -> why we compare using >= 0 -> represents string positions
            //will need to find the specified character using charAt
            if(vowels.indexOf(s.charAt(i)) >= 0) answer++;
            if(vowels.indexOf(s.charAt(j)) >= 0) answer--;
        }
        
        return (answer == 0); 
    }
}

/*
time complexity: O(n) -> depends on the length of the string
space complexity: O(1) -> not creating new string, looking through the same one
*/