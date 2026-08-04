class Solution {
    static int dp[];
    public int rob(int[] nums) {
        int n=nums.length;
        if (nums.length == 1)
    return nums[0];
       dp=new int [n];
       Arrays.fill(dp,-1);
       int case1=loot(1,n-1,nums);
       Arrays.fill(dp,-1);
        int case2=loot(0,n-2,nums);
       return Math.max(case1,case2);
        
    }
    private int loot(int i,int end,int nums[]){
         if(i>end)return 0;
         if(dp[i]!=-1)return dp[i];
         int pick=nums[i]+loot(i+2,end,nums);
         int skip=loot(i+1,end,nums);
         int ans=Math.max(pick,skip);
         dp[i]=ans;
         return dp[i];
    }
}