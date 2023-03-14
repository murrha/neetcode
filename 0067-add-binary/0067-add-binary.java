class Solution {
    public String addBinary(String a, String b) {
        
        
        //use StringBuilder to create bigger strings
        StringBuilder sb = new StringBuilder(); 
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int carry = 0;
        
        while(lengthA >= 0 || lengthB >= 0){
            
            //sum will be divided to return the carry bit
            int sum = carry;
            
            if(lengthA >= 0) sum += a.charAt(lengthA--) - '0'; 
            
            if(lengthB >= 0) sum += b.charAt(lengthB--) - '0'; 
            
            sb.append(sum % 2); 
            
            //will return a bit if not divisible
            carry = sum / 2; 
        }
        
        if(carry != 0) sb.append(carry); 
        return sb.reverse().toString();
    }
}