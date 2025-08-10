class Solution {
    public int[] countBits(int n) {
        int nums[]=new int[n+1];
        nums[0]=0;
        for(int i=1;i<=n;i++){
            // int count=0;
            // int a=i;
            
            nums[i]=Integer.bitCount(i);
        }
        return nums;

    }

}