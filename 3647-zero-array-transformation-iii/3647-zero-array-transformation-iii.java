class Solution {
      public int maxRemoval(int[] A, int[][] queries) {
        int n = A.length, nq = queries.length;
        Arrays.sort(queries, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> h = new PriorityQueue<>(); // min heap
        int[] end = new int[n + 1];
        int cur = 0, j = 0;
        for (int i = 0; i < n; ++i) {
            cur -= end[i];
            while (j < nq && queries[j][0] <= i) {
                h.offer(-queries[j][1]); // Add negative for min-heap
                j++;
            }
            while (cur < A[i]) {
                if (h.isEmpty() || -h.peek() < i) {
                    return -1;
                }
                end[-h.poll() + 1]++;
                cur++;
            }
        }
        return h.size();
    }
}