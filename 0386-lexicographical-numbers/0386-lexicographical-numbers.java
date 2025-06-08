class Solution {
    public void solve(int p, List<Integer> result, int n) {
        if (p > n) return;
        result.add(p);
        for (int i = 0; i <= 9; i++) {
            if (p * 10 + i <= n) {
                solve(p * 10 + i, result, n);
            }
        }
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            solve(i, result, n);
        }
        return result;
    }
}