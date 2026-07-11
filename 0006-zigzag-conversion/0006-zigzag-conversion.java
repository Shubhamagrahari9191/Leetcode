class Solution {
    public String convert(String s, int numRow) {
        
        if (numRow == 1 || s.length() <= numRow) {
            return s;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRow;i++){
            int idx=i;
            int deltaSouth=2*(numRow-1-i);
            int deltaNorth=2*i;
            boolean goingSouth=true;
            while(idx<s.length()){
                sb.append(s.charAt(idx));
                if(i==0){
                    idx+=deltaSouth;
                }
                else if(i==numRow-1){
                    idx+=deltaNorth;
                }
                else{
                    if(goingSouth){
                        idx+=deltaSouth;
                    }
                    else{
                    idx+=deltaNorth;
                    }
                    goingSouth=!goingSouth;
                }

            }
        }
        return sb.toString();
    }
}