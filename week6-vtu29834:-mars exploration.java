import java.io.*;

public class Solution {

    public static int marsExploration(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected;

            if (i % 3 == 0) {
                expected = 'S';
            } else {
                expected = 'O';
            }

            if (s.charAt(i) != expected) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(marsExploration(s));
    }
}
output:-
  3
