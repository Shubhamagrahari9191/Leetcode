class Solution {
    public boolean isMatch(String s, String p) {
        Boolean dp[][]=new Boolean[s.length()][p.length()];
      return solve(s , p ,s.length()-1, p.length()-1, dp);

    }
   public boolean solve(String s, String p, int i, int j, Boolean dp[][]) {
       
        // Both consumed
        if (i < 0 && j < 0) {
            return true;
        }

        // Pattern consumed but string still remains
        if (i >= 0 && j < 0) {
            return false;
        }

        // String consumed
        if (i < 0) {
            while (j >= 0) {
                if (p.charAt(j) != '*') {
                    return false;
                }
                j -= 2;
            }
            return true;
        }
           if( dp[i][j]!=null)
           return dp[i][j];
        

        // Normal character or '.'
        if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.') {
            return solve(s, p, i - 1, j - 1,dp);
        }

        // '*'
        if (p.charAt(j) == '*') {

            // Ignore character before '*'
            boolean notTake = solve(s, p, i, j - 2,dp);

            // Use '*'
            boolean take = false;

            if (p.charAt(j - 1) == s.charAt(i) ||
                p.charAt(j - 1) == '.') {

                take = solve(s, p, i - 1, j,dp);
            }

          return  dp[i][j]= take || notTake;
        }

      dp[i][j] =false;
      return false;
    }
}