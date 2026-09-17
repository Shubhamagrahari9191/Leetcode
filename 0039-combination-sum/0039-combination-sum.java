class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    int n;
    public List<List<Integer>> combinationSum(int[] c, int t) {
        n=c.length;
        solve(0,new ArrayList(),t,c);
        return ans;
        
    }
    public void solve(int i,List<Integer> list,int target,int []candidate){
        if(i==n || target<0)
        return;
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
            
        }

        //take
        list.add(candidate[i]);
        //include
        solve(i,list,target-candidate[i],candidate);
        //backtrack
        list.remove(list.size()-1);
        //skip
        solve(i+1,list,target,candidate);
    }

}