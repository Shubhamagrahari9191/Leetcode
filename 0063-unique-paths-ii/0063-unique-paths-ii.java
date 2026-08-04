class Solution {

    int dp[][];

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(obstacleGrid, 0, 0);
    }

    public int solve(int[][] grid, int i, int j) {

        int m = grid.length;
        int n = grid[0].length;

        // Out of bounds
        if (i >= m || j >= n)
            return 0;

        // Obstacle
        if (grid[i][j] == 1)
            return 0;

        // Destination
        if (i == m - 1 && j == n - 1)
            return 1;

        if (dp[i][j] != -1)
            return dp[i][j];

        return dp[i][j] =
                solve(grid, i + 1, j) +
                solve(grid, i, j + 1);
    }
}