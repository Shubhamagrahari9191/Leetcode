class Solution {
    public int longestSubsequence(int[] nums) {
         int n = nums.length;
        int resultXor = 0;
        long sum=0;
        for(int x : nums) {
           sum+=x;
            resultXor ^= x;    
        }
       if(sum==0)
        return 0;
        return resultXor == 0 ? n-1 : n; 
    }
}