class Solution {
    public char kthCharacter(long k, int[] ops) {
         int shift = 0;
        k--;
        for (int i = ops.length - 1; i >= 0; i--) {
            long half = (i >= 60) ? Long.MAX_VALUE : 1L << i;
            if (k >= half) {
                k -= half;
                shift += ops[i];
            }
        }
        return (char)('a' + shift % 26);
    }
}