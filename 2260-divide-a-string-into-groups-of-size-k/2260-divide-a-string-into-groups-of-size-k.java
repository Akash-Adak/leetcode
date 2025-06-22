class Solution {
    public String[] divideString(String s, int k, char fill) {
      String[] ans = new String[(int)Math.ceil((double)s.length() / k)];
     int j = 0;
for (int i = 0; i < s.length(); i += k) {
    int end = Math.min(i + k, s.length());
    String group = s.substring(i, end);
    
    while (group.length() < k) {
        group += fill;
    }
    ans[j++] = group;
}
    return ans;
    }
}