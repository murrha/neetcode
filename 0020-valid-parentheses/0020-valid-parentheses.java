class Solution {
    public boolean isValid(String s) {
        /*
        same type in correct order -> implement with stack
        
        push in the opening brackets onto the stack
        else if we encounter a closing bracket
            peek function to assign to a char value
                check if that closing bracket has a matching opening bracket
                if none of them match -> return false
        return true if the stack is empty
        
        TC: O(n) -> move through the string
        SC: O(n) -> creating a stack
        
        */
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if (stack.isEmpty()){
                return false;
            }else{
                char top = stack.pop();
                if(top == '(' && c != ')') return false; 
                if(top == '{' && c != '}') return false; 
                if(top == '[' && c != ']') return false; 
            }
        }//endfor
        
        return stack.empty(); 
    }
}