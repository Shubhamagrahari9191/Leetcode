class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
          for (int i=0;i<n;i++){
          adj.add(new ArrayList<>());
          }
          for(int []edge:edges){
            adj.get(edge[0]).add(edge[1]); //Yaani 0 ki list me 1 add karo.
            //   0 -> [1]
            //   1 -> []
            //   2 -> []
             adj.get(edge[1]).add(edge[0]);//Yaani 1 ki list me 0 add karo.
            //  0 -> [1]
            //  1 -> [0]
            //  2 -> []
          }
          boolean[]visited=new boolean[n];
          return dfs(source,destination,adj,visited);
    }
    public boolean dfs(int node,int destination,ArrayList<ArrayList<Integer>>adj,boolean[]visited ){
        if(node==destination)return true;
        visited[node]=true;
        for(int ele:adj.get(node)){
            if(!visited[ele]){
                if(dfs(ele,destination,adj,visited)){
                    return true;
                }
            }
        }
            return false;
        
        
    }
}