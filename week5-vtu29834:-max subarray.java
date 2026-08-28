import java.util.*;

public class Solution {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        int current = arr.get(0);
        int maxSub = arr.get(0);

        // Maximum contiguous subarray
        for (int i = 1; i < arr.size(); i++) {

            current = Math.max(arr.get(i), current + arr.get(i));
            maxSub = Math.max(maxSub, current);
        }

        // Maximum non-contiguous subarray
        int maxNonSub = 0;
        int maxElement = arr.get(0);

        for (int num : arr) {

            if (num > 0) {
                maxNonSub += num;
            }

            maxElement = Math.max(maxElement, num);
        }

        // If all numbers are negative
        if (maxNonSub == 0) {
            maxNonSub = maxElement;
        }

        return Arrays.asList(maxSub, maxNonSub);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }

        sc.close();
    }
}
output:-
  10 10
10 11
