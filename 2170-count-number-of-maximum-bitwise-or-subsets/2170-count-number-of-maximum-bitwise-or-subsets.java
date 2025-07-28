class Solution {
    public int solve(int ind, int[] nums, int n, long target, long value) {
        if (ind == n)
            return value == target ? 1 : 0;
        
        long newValue = value | nums[ind];
        
        int count = solve(ind + 1, nums, n, target, newValue);
        count += solve(ind + 1, nums, n, target, value);
        
        return count;
    }

    public int countMaxOrSubsets(int[] nums) {
        long target = nums[0];
        for (int i = 1; i < nums.length; i++) {
            target |= nums[i];
        }

        int n = nums.length;
        long value = 0;

        return solve(0, nums, n, target, value);
    }
}