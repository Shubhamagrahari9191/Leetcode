class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] present = new boolean[1501];

        for (int x : nums)
            present[x] = true;

        int MAX = 2048;

        boolean[][] dp = new boolean[4][MAX];
        dp[0][0] = true;

        for (int val = 1; val <= 1500; val++) {
            if (!present[val]) continue;
            for (int cnt = 0; cnt < 3; cnt++) {
                boolean[] next = dp[cnt + 1];
                boolean[] cur = dp[cnt];

                for (int x = 0; x < MAX; x++) {
                    if (cur[x]) {
                        next[x ^ val] = true;
                    }
                }
            }
        }

        int ans = 0;
        for (boolean b : dp[3]) {
            if (b) ans++;
        }

        return ans;
    }
}