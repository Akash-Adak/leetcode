class Solution {
    public int maxProfit(int[] p) {
        int max=0;
        int buy=p[0];
        for(int i=1;i<p.length;i++){
            if(buy>p[i]){
                buy=p[i];
            }
            max=Math.max(max,p[i]-buy);
        }
        return max;
    }
}