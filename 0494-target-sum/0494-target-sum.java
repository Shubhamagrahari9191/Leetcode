class Solution {
        HashMap<String,Integer> map=new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
               
               return solve(nums,0,0,target);
    }
    public  int solve( int nums[],int i,int currsum,int target){
    
        if(i==nums.length)
           return currsum==target ?1:0;

          String key= i+ "," +currsum;
          if(map.containsKey(key)){
            return map.get(key);
          }
          int add=solve(nums,i+1,currsum+nums[i],target);
          int subtract=solve(nums,i+1,currsum-nums[i],target);
          map.put(key,add+subtract);
          return add+subtract;
        
    }
}