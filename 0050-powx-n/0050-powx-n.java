class Solution {
    public double myPow(double x, int n) {
    long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

      return solve(x,n);
      
        
    }
    public double solve(double x,int  n){
    
        if(n==0)
        return 1;
     double call=  solve(x,n/2);
     if(n%2==0)return call*call;
     else
     return call*call*x;
    
    }
}