class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ArrayList<List<Integer>> result=new ArrayList<>();

        int m=grid.length;
        int n=grid[0].length;
        int[][] ans = new int[m][n];
        int total=m*n;
        k%=total;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               
                int oldindex=i*n+j;
                int newindex=(oldindex+k)%total;
                  int newRow = newindex / n;
                int newCol = newindex % n;
                 ans[newRow][newCol]=grid[i][j];
            }
        }
        for(int i=0;i<m;i++){
                               ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                list.add(ans[i][j]);
            }
            result.add(list);

        }
        return result;
    }
}