class Solution {
    public int evalRPN(String[] arr) {

        // code here
         Stack<String> st=new Stack<>();
        for(String s:arr){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
             
                 int b=Integer.parseInt(st.pop());
                    int a=Integer.parseInt(st.pop());
                 int ans=0;
                 if(s.equals("+")) ans=a+b;
                 else if( s.equals("*")) ans=a*b;
                 else if(s.equals("/")) ans=a/b;
                 else if(s.equals("-")) ans=a-b;
                 st.push(String.valueOf(ans));
            }else{
                st.push(s);
            }
        }
        return Integer.parseInt(st.pop());
        
    }

}