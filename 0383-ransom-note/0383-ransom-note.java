class Solution {
    public boolean canConstruct(String r, String m) {

        int[] freq = new int[26];

        for (int i = 0; i < m.length(); i++) {
            freq[m.charAt(i) - 'a']++;
        }

        for (int i = 0; i < r.length(); i++) {

            int index = r.charAt(i) - 'a';

            if (freq[index] == 0) {
                return false;
            }

            freq[index]--;
        }

        return true;
    }
}