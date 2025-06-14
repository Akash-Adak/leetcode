class Solution {
   public int minMaxDifference(int num) {
        StringBuilder n = new StringBuilder(Integer.toString(num));
        int len = n.length();
        StringBuilder max = new StringBuilder();
        boolean flag = false;
        char f = ' ';
        
        for(int i=0;i<len;i++){
            char ch = n.charAt(i);
            
            if(ch == f) max.append('9');
            
            else if(ch != '9' && !flag){
                f=ch;
                flag=true;
                max.append('9');
            }
            else max.append(ch);
        }
        
        StringBuilder min = new StringBuilder();
        min.append('0');
        f = n.charAt(0);
        
        for(int i=1;i<len;i++){
            char ch = n.charAt(i);
            if(ch == f) min.append('0');
            else min.append(ch);
        }
        return Integer.valueOf(max.toString()) - Integer.valueOf(min.toString());
    }
}