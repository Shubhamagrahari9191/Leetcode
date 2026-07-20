class Solution {
      int dp[]=new int [46];
    public int climbStairs(int n) {
      if (dp[0] == 0) {      
            Arrays.fill(dp, -1);
        }
        
        if(n<=3)
        return n;
        if(dp[n]!=-1)
        return dp[n];
       dp[n]=climbStairs(n-1)+climbStairs(n-2);
       return dp[n];
    }
}