import java.util.*;

class Solution {

    public List<String> findAndReplacePattern(
            String[] words, String pattern) {

        List<String> result = new ArrayList<>();

        for (String word : words) {

            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {

        // Maps word character -> pattern character
        HashMap<Character, Character> map1 = new HashMap<>();

        // Maps pattern character -> word character
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);
            char p = pattern.charAt(i);

            // Check word -> pattern mapping
            if (map1.containsKey(w) && map1.get(w) != p) {
                return false;
            }

            // Check pattern -> word mapping
            if (map2.containsKey(p) && map2.get(p) != w) {
                return false;
            }

            map1.put(w, p);
            map2.put(p, w);
        }

        return true;
    }
}
output:-
  ["mee","aqq"]
