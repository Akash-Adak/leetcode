import java.util.Hashtable;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Hashtable<Character, Integer> set = new Hashtable<>();

        // Count the frequency of each character
        for (char ch : s.toCharArray()) {
            set.put(ch, set.getOrDefault(ch, 0) + 1);
        }

        // Check if all frequencies are the same
        return set.values().stream().distinct().count() <= 1;
    }
}
