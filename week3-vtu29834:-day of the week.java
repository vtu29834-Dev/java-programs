class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Java Calendar uses month 0-11
        java.util.Calendar cal = java.util.Calendar.getInstance();

        cal.set(year, month - 1, day);

        int dayNumber = cal.get(java.util.Calendar.DAY_OF_WEEK);

        return days[dayNumber - 1];
    }
}
output:-
  Saturday
