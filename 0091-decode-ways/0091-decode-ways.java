class Solution {
   int []t=new int[101];
        int solve(int i,String s,int n){
            if(t[i]!=-1){
                return t[i];
            }
            if(i==n)
            return t[i]=1;
            if(s.charAt(i)=='0')
            return t[i]=0;
            int result=solve(i+1,s,n);
            if(i+1<n){
            if(s.charAt(i)=='1'||(s.charAt(i)=='2'&& s.charAt(i+1)<='6'))
            result+=solve(i+2,s,n);
            }
            return t[i]=result;
        }
        
 public int numDecodings(String s) {
    int n=s.length();
    Arrays.fill(t,-1);
    return solve(0,s,n);
    }
}