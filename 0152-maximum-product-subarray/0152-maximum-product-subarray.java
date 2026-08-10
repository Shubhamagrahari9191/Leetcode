class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int left=1;
        int right=1;
        int ans=nums[0];
       for(int i=0;i<n;i++){
        left*=nums[i];
        right*=nums[n-1-i];
        ans=Math.max(ans,Math.max(left,right));
        if(left==0)
        left=1;
        if(right==0)
        right=1;
       }
       return ans;
    }
}