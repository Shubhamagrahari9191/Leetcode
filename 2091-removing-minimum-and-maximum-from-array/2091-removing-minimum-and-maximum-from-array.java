class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int maxIdx=0;
        int minIdx=0;
       
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxIdx]){
                maxIdx=i;
            }
            if(nums[i]<nums[minIdx]){
                minIdx=i;
             
            }
        }
        int leftIdx=Math.min(minIdx,maxIdx);
        int rightIdx=Math.max(maxIdx,minIdx);
        return Math.min(leftIdx+1+n-rightIdx,Math.min(rightIdx+1,n-leftIdx));
        
    }
}