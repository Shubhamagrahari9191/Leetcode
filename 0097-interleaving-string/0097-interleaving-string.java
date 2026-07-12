class Solution {
   
        int m,n,l;
        int t[][][]=new int [201][201][201];
        boolean solve(int i,int j,int k, String s1, String s2, String s3){
            if(i==m && j==n && k==l){
                return true;
            }
            if(k>=l){
                return false;
            }
            if(t[i][j][k]!=-1){
                return t[i][j][k]==1;
                      }
            boolean result=false;
            if(i<m && s1.charAt(i)==s3.charAt(k)){
              result= solve(i+1,j,k+1,s1,s2,s3); 
            }

               if(result==true){
                t[i][j][k]=1;
               return result;
               }

            if(j<n && s2.charAt(j)==s3.charAt(k)){
               result=solve(i,j+1,k+1,s1,s2,s3);
            }
           t[i][j][k]=result?1:0;
               return result;
        }
         public boolean isInterleave(String s1, String s2, String s3) {
            m=s1.length();
            n=s2.length();
            l=s3.length();
            if(m+n!=l){
                return false;
            }
            for(int dp[][]:t){
                for(int row[]:dp){
            Arrays.fill(row,-1);
                }
            }
            return solve(0,0,0,s1,s2,s3);
    }
}