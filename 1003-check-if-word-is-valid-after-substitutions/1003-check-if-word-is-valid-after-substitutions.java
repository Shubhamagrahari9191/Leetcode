class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i <= sb.length() - 3; i++) {
            if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b' && sb.charAt(i + 2) == 'c') {
                sb.delete(i, i + 3);
                i =-1;
            }
            

        }

        return sb.length()== 0;
    }
}
