class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
       int  prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }
        int x=sum+prod;
        if(original%x==0){
        return true;
        }
        return false;
    }
}