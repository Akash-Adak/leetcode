class Solution {
    public boolean isAnagram(String s, String t) {
        int[] c=new int[26];
        for(char ch:s.toCharArray()){
            c[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            c[ch-'a']--;
        }
        boolean allZero = Arrays.stream(c).allMatch(x -> x == 0);
return allZero;
    }
}