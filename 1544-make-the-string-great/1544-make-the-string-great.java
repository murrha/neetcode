class Solution {
    public String makeGood(String s) {
        
        //make a stack of characters
        Stack<Character> stack = new Stack<>(); 
     
        for(char current: s.toCharArray()){
            
            //if we find that they make a pair -> their difference is 32
            //use the built in math function to find the difference in the character
           if (!stack.isEmpty() && Math.abs(stack.lastElement() - current) == 32)
                
                //pop off the pair
                stack.pop();
            else
                stack.add(current);
        }
        
        //use the string builder to create the concatenated string from the stack
        StringBuilder sb= new StringBuilder();
        for(char c: stack){
            sb.append(c);
        }
        
        return sb.toString(); 
    }
}