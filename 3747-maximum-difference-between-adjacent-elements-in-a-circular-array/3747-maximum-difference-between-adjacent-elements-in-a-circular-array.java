class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length-1;i++){
            int diff=Math.abs(nums[i]-nums[i+1]);
            d=Math.max(d,diff);
        }
       return Math.max(d,Math.abs(nums[0]-nums[nums.length-1]));
    }
}