class Solution {
    public void moveZeroes(int[] nums) {
      int i=0;
      for(int n:nums){
        if(n!=0) nums[i++]=n;
      }
      for(int j=i;j<nums.length;j++){
        nums[j]=0;
      }
    }
}