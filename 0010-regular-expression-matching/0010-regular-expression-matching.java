class Solution {
    public boolean isMatch(String s, String p) {
      return solve(s , p ,s.length()-1, p.length()-1);

    }
   public boolean solve(String s, String p, int i, int j) {

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

        // Normal character or '.'
        if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.') {
            return solve(s, p, i - 1, j - 1);
        }

        // '*'
        if (p.charAt(j) == '*') {

            // Ignore character before '*'
            boolean notTake = solve(s, p, i, j - 2);

            // Use '*'
            boolean take = false;

            if (p.charAt(j - 1) == s.charAt(i) ||
                p.charAt(j - 1) == '.') {

                take = solve(s, p, i - 1, j);
            }

            return take || notTake;
        }

        return false;
    }
}