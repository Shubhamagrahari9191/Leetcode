// class Solution {
//     public int countCommas(int n) {
//         int len=0;
//         while(n>0){
//            int digit= n%10;
//             len++;
//            n=n/10;
//         }
//         if(len<4)
//         return 0;
//         return (len-1)/3;
//     }
// }
class Solution {
    public int countCommas(int n) {
       if (n < 1000) {
            return 0;
        }

        return n - 999;
    }
}