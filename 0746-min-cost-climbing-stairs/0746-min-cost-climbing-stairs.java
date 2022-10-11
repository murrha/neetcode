class Solution {
    
    
    public int minCostClimbingStairs(int[] cost) {
        
        /*
        hints: 
        1. Build an array dp where dp[i] is the minimum cost to climb to the top starting from the ith staircase.
        2. Assuming we have n staircase labeled from 0 to n - 1 and assuming the top is n, then dp[n] = 0, marking that if you are at the top, the cost is 0.
        3. Now, looping from n - 1 to 0, the dp[i] = cost[i] + min(dp[i + 1], dp[i + 2]). The answer will be the minimum of dp[0] and dp[1]
        
        
        */
        int n = cost.length; 
        
        int dp[] = new int[n + 1];
        dp[n] = 0;
        dp[n - 1] = cost[n - 1];
        
        for(int i = n - 2; i >= 0; i--){
            dp[i] = 
                (dp[i + 1] < dp[i + 2]) ? dp[i + 1] + cost[i]: dp[i + 2] + cost[i];
        }
        
        return Math.min(dp[0], dp[1]); 
        
    }
}