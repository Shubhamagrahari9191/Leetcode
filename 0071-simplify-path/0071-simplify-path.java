class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String [] parts=path.split("/");
        for(String dir:parts){
            if(dir.equals("")||dir.equals(".")){
                continue;
            }
            else if(dir.equals("..")){
                if(!st.isEmpty())
                st.pop();
            }
            else
            st.push(dir);
        }
            if(st.isEmpty()){
                return "/";
            }
            StringBuilder sb=new StringBuilder();
            for(String s:st){
                sb.append("/").append(s);
            }
            return sb.toString();
        
    }
}