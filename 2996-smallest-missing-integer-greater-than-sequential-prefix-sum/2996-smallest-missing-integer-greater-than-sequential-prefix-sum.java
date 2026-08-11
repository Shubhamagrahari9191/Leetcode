class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int j=1; 
        int ans=nums[0];
       
        for(int i=1;i<n;i++){
         if(nums[i]==nums[i-1]+1){
            ans+=nums[i];
         }
         else
            break;
        }

        while(true){
              boolean found = false;
            for(int x:nums){
             if(x==ans){
                found=true;
                 ans++;
                 break;
             }
            }
            if(!found)return ans;
        }
        

   
         
            
        
    }
}