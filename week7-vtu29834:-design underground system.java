import java.util.*;

class UndergroundSystem {

    // Stores check-in information
    Map<Integer, String> checkInStation;
    Map<Integer, Integer> checkInTime;

    // Stores total time and number of trips
    Map<String, long[]> routeData;

    public UndergroundSystem() {
        checkInStation = new HashMap<>();
        checkInTime = new HashMap<>();
        routeData = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInStation.put(id, stationName);
        checkInTime.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {
        String startStation = checkInStation.get(id);
        int startTime = checkInTime.get(id);

        String route = startStation + "->" + stationName;

        if (!routeData.containsKey(route)) {
            routeData.put(route, new long[2]);
        }

        long[] data = routeData.get(route);

        // data[0] = total time
        // data[1] = number of trips
        data[0] += t - startTime;
        data[1]++;

        checkInStation.remove(id);
        checkInTime.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;

        long[] data = routeData.get(route);

        return (double) data[0] / data[1];
    }
}
output :-
  14.0
11.0
