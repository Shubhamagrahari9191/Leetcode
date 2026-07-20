class Solution {
    public int findGCD(int[] nums) {
         int n=nums.length;
         int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
         if(nums[i]<min){
            min=nums[i];
         }
         }
         for(int i=0;i<n;i++){
         if(nums[i]>max){
            max=nums[i];
         }
         }
         while(max != 0){
            int rem = min % max;
            min = max;
            max = rem;
        }

        return min;
    

          
    }
}