class Solution {
    int dp[];
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        dp=new int [n];
        Arrays.fill(dp,-1);
       int diff=  solve(stoneValue,0);
       if(diff>0){
        return  "Alice";
       }
       else if(diff<0)
       return "Bob";
       return "Tie";
        

    }
    public int solve(int nums[],int i){
        if(i>=nums.length){
            return 0;
        }
        int result=0;
        if(dp[i]!=-1)return dp[i];
        result=nums[i]-solve(nums,i+1);
        if(i+1<nums.length)
        result=Math.max(result,nums[i]+nums[i+1]-solve(nums,i+2));
        if(i+2<nums.length)
        result=Math.max(result,nums[i]+nums[i+1]+nums[i+2]-solve(nums,i+3));
         return dp[i]=result;
    }
}