import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']--;

            if (i >= windowSize) {
                count[s.charAt(i - windowSize) - 'a']++;
            }

            if (i >= windowSize - 1 && allZero(count)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    private boolean allZero(int[] count) {
        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}
output:-
  [0, 6]
