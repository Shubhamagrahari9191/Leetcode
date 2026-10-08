class Solution {
    public int[] asteroidCollision(int[] a) {
    Stack<Integer> st=new Stack<>();
    for(int x:a){
        while(!st.isEmpty() && st.peek()>0 && x<0){
            if(st.peek() < Math.abs(x)){
                st.pop();
            }
            else if(st.peek()== Math.abs(x)){
                st.pop();
                x=0;
                break;
            }
            else{
                x=0;
                break;
            }
        }
        if(x!=0){
            st.push(x);
        }
    }
    int ans[]=new int [st.size()];
    for(int i=st.size()-1;i>=0;i--){
        ans[i]=st.pop();
    }
    return ans;
       
    }
}