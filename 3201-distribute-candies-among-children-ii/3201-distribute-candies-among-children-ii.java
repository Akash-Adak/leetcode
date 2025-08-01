class Solution {
  public long distributeCandies(int n, int limit) {
    long ans = 0;
    int firstMin = Math.max(0, n - 2*limit);
    int firstMax = Math.min(limit, n);
    for(int i = firstMin; i <= firstMax; ++i ){
        int secondMin = Math.max(0, n - i - limit);
        int secondMax = Math.min(limit, n - i);
        ans += secondMax - secondMin + 1;
    }
    return ans;
}
}