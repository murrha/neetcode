class Solution {
    public boolean isValid(String s) {
        /*
        same type of brackets
        closed in correct order
        corresponding same type
        
        if it's empty return false
        
        stack kind of problem since we have to make sure that the same type of brackets are being matched
        
        first convert in the string to a char array
        create a stack to store the character's in
        
        for every i in char array
            push the characters that match the opening bracket {, [, (
            
            if the char[i] == {, [, (
                push onto the stack
            else if the stack isEmpty
                return false
            else
                peek to see if the closing bracket matches with it's correspondent
                    if the peek == { && array[i] != } false
                    if the peek == [ && array[i] != ] false
                    if the peek == ( && array[i] != ) false
            
            
           return if stack.empty()
        */
        
       Stack<Character> stack = new Stack<>(); 
        for(char st: s.toCharArray()){
            if (st == '{' || st == '(' || st == '['){
                stack.push(st);
            }
            else if(stack.isEmpty()){
                    return false;
            }
            else {
                char top = stack.pop();
                if(st == '}' && top != '{') return false; 
                if(st == ')' && top != '(') return false; 
                if(st == ']' && top != '[') return false; 
            } 
                    
            }
        return stack.empty(); 
    }
}

//time complexity: O(n)
//space complexity: O(n)