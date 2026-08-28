import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create list of elements
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort based on frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Store top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
output:-
  [1,2]
