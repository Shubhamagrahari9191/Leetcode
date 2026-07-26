class Solution {
    public int lengthOfLongestSubstring(String s) {
          HashSet<Character> set = new HashSet<>();

        int low = 0;
        int max = 0;

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            while (set.contains(ch)) {
                set.remove(s.charAt(low));
                low++;
            }

            set.add(ch);

            max = Math.max(max, high - low + 1);
        }

        return max;
    }
}