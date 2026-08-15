class Solution {
    public int longestSubsequence(int[] nums) {
         int n = nums.length;
        int resultXor = 0;
        int cnt=0;
        for(int x : nums) {
           if(x==0)
             cnt++;
            resultXor ^= x;    
        }
       if(cnt==n)
        return 0;
        return resultXor == 0 ? n-1 : n; 
    }
}