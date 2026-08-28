import java.util.*;

class Result {

    public static String timeConversion(String s) {

        String[] parts = s.split(":");

        int hour = Integer.parseInt(parts[0]);
        String minutes = parts[1];
        String seconds = parts[2].substring(0, 2);
        String ampm = parts[2].substring(2);

        if (ampm.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d:%s:%s", hour, minutes, seconds);
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(Result.timeConversion(s));

        sc.close();
    }
}
output:-
  19:05:45
