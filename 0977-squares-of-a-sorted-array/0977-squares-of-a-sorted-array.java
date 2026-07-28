class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int idx=nums.length-1;
        int ans[]=new int [nums.length];
        while(i<=j){
            if( Math.abs(nums[i])>Math.abs(nums[j])){
              ans[idx]=nums[i] *nums[i];
              i++;
            }
              else {
               ans[idx]=nums[j]*nums[j];
                j--;
              } 
               
                idx--;
            }
        
        
        return ans;
    }
}