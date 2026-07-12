class Solution {
    int n;
    int t[]=new int [301];
  Set<String> set=new HashSet<>();
  boolean solve(int idx,String s){
   
    if(idx>=n){
        return true;
    }
     if(t[idx]!=-1){
        return t[idx]==1;
       
       
    }
    if(set.contains(s)){
         return true;
    }
    for(int l=idx;l<n;l++){
        String temp=s.substring(idx,l+1);
        if(set.contains(temp)&& solve(1+l,s)){
           t[idx]=1;
            return true;
        }
    }
     t[idx]=0;
     return false;

  }




    public boolean wordBreak(String s, List<String> wordDict) {
      
         n=s.length();
        for(String word:wordDict){
            set.add(word);
        }
        Arrays.fill(t,-1);
                return solve(0,s);
    }
}