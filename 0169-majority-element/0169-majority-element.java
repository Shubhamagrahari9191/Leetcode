class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
//         int count=0;
//         int candidate=0;
//         for(int num:nums){
//             if(count==0)
//                 candidate=num;
            
//                 if(candidate==num)
//                 count+=1;
            
//             else
//             count-=1;
//         }
// return candidate;
int freq=0;
int ans=0;
for(int i=0;i<n;i++){
    if(freq==0)
    ans=nums[i];
    if(ans==nums[i]){
        freq++;
    }
    else{
        freq--;
    }
}
     return ans;  
       
}
}