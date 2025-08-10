class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){

         String binary = Integer.toBinaryString(i); 
        //  int c=Integer.bitCount(Integer.parseInt(binary));
        StringBuilder sb = new StringBuilder(binary);
        long count = sb.toString().chars().filter(c -> c == '1').count();

            ans[i]=(int)count;
        }
        return ans;
    }
}