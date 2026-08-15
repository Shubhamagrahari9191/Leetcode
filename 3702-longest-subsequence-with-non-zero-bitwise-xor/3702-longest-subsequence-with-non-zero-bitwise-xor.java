class Solution {
    public int longestSubsequence(int[] nums) {
         int n = nums.length;

        int resultXor = 0;
        boolean allZero = true;
        int cnt=0;
        for(int x:nums){
          if(x==0)
          cnt++;

        }
        if(cnt==n)
        return 0;

        for(int x : nums) {
           
            resultXor ^= x;
            
            // if(x != 0)
            //     allZero = false;
        }

        // if(allZero)
        //     return 0;
        
        return resultXor == 0 ? n-1 : n; 
    }
}