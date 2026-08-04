class Solution {
    public List<Integer> findMissingElements(int[] nums) {
           Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
     
        int start=nums[0];
      for(int i=0;i<nums.length;i++){
        if(nums[i]==start){
         
            start++;
        }
        else{
            list.add(start);
            start++;
            i--;
        }    
        }
        return list;
        
    }
}