import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) return false;
            } else {
                if (wordSet.contains(word)) return false; // Prevent multiple letters mapping to the same word
                map.put(ch, word);
                wordSet.add(word);
            }
        }

        return true;
    }
}
