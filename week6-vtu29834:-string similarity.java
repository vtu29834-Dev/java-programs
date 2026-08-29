import java.io.*;
import java.util.*;

public class Solution {

    public static long stringSimilarity(String s) {
        int n = s.length();
        long sum = 0;

        int[] z = new int[n];

        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            while (i + z[i] < n &&
                   s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }

        // The complete string is always similar to itself
        sum = n;

        for (int i = 1; i < n; i++) {
            sum += z[i];
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            System.out.println(stringSimilarity(s));
        }
    }
}
output:-
  11
3
