class Solution {
       int m,n,l;
       int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
       boolean find(char[][]board,String word,int i,int j,int idx){
       if(idx>=l)
       return true;
       if(i<0||i>=m||j<0||j>=n||board[i][j]!=word.charAt(idx))
       return false;
       char temp=board[i][j];
       board[i][j]='#';
       for(int dirc[]:dir){
        int i_=i+dirc[0];
        int j_=j+dirc[1];
        if(find(board,word,i_,j_,idx+1))
        return true;
       }
       board[i][j]=temp;
       return false;
       }
public boolean exist(char[][] board, String word) {
      m=board.length;
        n=board[0].length;
       l=word.length();
      if(m*n<1)
         return false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0) && find(board,word,i,j,0))
                return true;
            }
        }
        return false;
    }
}