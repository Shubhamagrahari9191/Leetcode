class Solution {
    public int findCircleNum(int[][] isConnected) {
           int n=isConnected.length;
        boolean isVisited[]=new boolean[n];
     
        int count=0;
        for(int i=0;i<n;i++){
             if(!isVisited[i]){
                bfs(i,isVisited,isConnected);
                count++;
             }
            
        }
         return count;
    }
        private void bfs(int i,boolean[] visit,int [][]adj){
            int n=adj.length;
            visit[i]=true;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(q.size()>0){
              int front=q.remove();
              for(int j=0;j<n;j++){
                if(adj[front][j]==1&& visit[j]==false){
                    q.add(j);
                    visit[j]=true;
                }
              }
            }
        }
    
}