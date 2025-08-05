class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int[] check=new int[baskets.length];
        Arrays.fill(check,-1);
        int c=0;
        for(int i:fruits){
            for(int j=0;j<baskets.length;j++){
                if(check[j]==-1 && baskets[j]>=i){
                    check[j]=baskets[j];
                    break;
                }
            }
            
        }
        for(int i:check){
            if(i==-1) c++;
        }
        return c;
     }

}