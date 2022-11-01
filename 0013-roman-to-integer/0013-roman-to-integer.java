class Solution {
    public int romanToInt(String s) {
        /*
        assigned values for each variable - table to store the value
        I = 1
        V = 5 
        etc.
        
        start at the end to make it easier for the math
        
        */
        int result = 0, num = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            
            switch(c){
                case 'I': num = 1; 
                break; 
                case 'V': num = 5; 
                break;
                case 'X': num= 10; 
                break;
                case 'L': num= 50; 
                break;
                case 'C': num= 100; 
                break;
                case 'D': num= 500; 
                break;
                case 'M': num= 1000; 
                break;
            }//end switch 
        
        if(4 * num < result) result -= num;
        else result += num;
        
    }//end for
    
    return result; 
}
}