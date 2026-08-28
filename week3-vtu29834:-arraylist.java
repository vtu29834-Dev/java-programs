import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read the lists
        for (int i = 0; i < n; i++) {

            int d = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                arr.add(sc.nextInt());
            }

            list.add(arr);
        }

        // Number of queries
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
output:-
  74
37
27
ERROR!
14
