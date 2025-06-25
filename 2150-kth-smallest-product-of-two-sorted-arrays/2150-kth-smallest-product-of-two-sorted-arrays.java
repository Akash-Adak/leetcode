class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
   
        long low = -100_000L * 100_000L;
        long high = 100_000L * 100_000L;

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (countLessOrEqual(nums1, nums2, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private long countLessOrEqual(int[] A, int[] B, long x) {
        long count = 0;
        for (int a : A) {
            if (a == 0) {
                if (x >= 0) count += B.length;
            } else if (a > 0) {
                // Count number of b in B such that a * b <= x → b <= x / a
                int l = 0, r = B.length;
                while (l < r) {
                    int m = l + (r - l) / 2;
                    if ((long) a * B[m] <= x) l = m + 1;
                    else r = m;
                }
                count += l;
            } else { // a < 0
                // a is negative, so a * b <= x → b >= x / a
                int l = 0, r = B.length;
                while (l < r) {
                    int m = l + (r - l) / 2;
                    if ((long) a * B[m] <= x) r = m;
                    else l = m + 1;
                }
                count += B.length - l;
            }
        }
        return count;
    }


}