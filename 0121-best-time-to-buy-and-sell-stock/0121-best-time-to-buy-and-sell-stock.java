class Solution {
    public int maxProfit(int[] prices) {
        
        /*
        find the two days of getting a maximum profit, can't use the same day and can only go forward
        find the lowest number at that point in time  -> variable to buy = INTEGER.MAX_VALUE -> find an element that's smaller to replace it
        use another pointer to go to the next element and find the biggest difference -> declare a variable called difference = 0 -> if the value is bigger than the current difference we set it as the new one
        
        [7,1,5,3,6,4] -> 5, buy on day 2 then sell on day 5
        
        */
        
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            
            //replace the previous buy value with the current one
            if(prices[i] < buy){
                buy = prices[i];
                
                for(int j = i + 1; j < prices.length; j++){
                    int diff = prices[j] - prices[i];
                    
                    if(diff > profit){
                        profit = diff;
                    }//endif
                }//endforj
            }//endif
        }//endfori
        
        return profit; 
    }
}