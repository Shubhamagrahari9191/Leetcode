class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // i vowel nahi hai
            if (!isVowel(sb.charAt(i))) {
                i++;
            }

            // j vowel nahi hai
            else if (!isVowel(sb.charAt(j))) {
                j--;
            }

            // dono vowel hain
            else {
                char temp = sb.charAt(i);

                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);

                i++;
                j--;
            }
        }

        return sb.toString();
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}