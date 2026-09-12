import java.io.*;
import java.util.*;

public class Solution {

    static class Pair {
        String first;
        String second;

        Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (!(obj instanceof Pair))
                return false;

            Pair other = (Pair) obj;

            return first.equals(other.first)
                    && second.equals(other.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        HashSet<Pair> set = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String line = br.readLine();

            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }

            StringTokenizer st = new StringTokenizer(line);

            String a = st.nextToken();
            String b = st.nextToken();

            set.add(new Pair(a, b));

            result.append(set.size()).append('\n');
        }

        System.out.print(result);
    }
}
output:-
  1
2
2
3
3
