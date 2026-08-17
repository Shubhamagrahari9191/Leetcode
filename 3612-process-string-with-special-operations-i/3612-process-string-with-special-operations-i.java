class Solution {
    public String processStr(String s) {
        int n=s.length();
      StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(Character.isLowerCase(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i)=='*'){
                if(sb.length()>=1)
             sb.deleteCharAt(sb.length()-1);
            }
            if(s.charAt(i)=='#'){
                sb.append(sb);
            }
            if(s.charAt(i)=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}