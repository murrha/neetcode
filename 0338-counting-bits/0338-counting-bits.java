class Solution {
    
    private int numBits(int n){
        int counter = 0;
        while (n != 0){
            n = n & (n - 1); //help with shift bits to the right
            counter++;
        }
        
        return counter;
    }
    
    public int[] countBits(int n) {
        
        int newArray[] = new int[n + 1];
        
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = numBits(i);
        }
        
        return newArray; 
    }
}