class Solution { 
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [2][n];
        if(m==1||n==1)return 1;
    for(int i=0;i<n;i++){
        dp[0][i]=1;

    }
    dp[1][0]=1;
    for(int a=1;a<=m-1;a++){
        //filling first row
        for(int j=1;j<n;j++){
        dp[1][j]=dp[0][j]+dp[1][j-1];
    }
    
    for(int j=1;j<n;j++){
        dp[0][j]=dp[1][j];
    }
    }
    return dp[1][n-1];

    }
}