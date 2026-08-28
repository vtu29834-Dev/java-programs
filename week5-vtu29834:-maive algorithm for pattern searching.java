import java.util.*;

class Main {

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        // Check pattern at every position
        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // Pattern found
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        search(text, pattern);

        sc.close();
    }
}
output:-
  Pattern found at index 0
Pattern found at index 9
Pattern found at index 12
