import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {
    public static void main(String[] args) {
    String[] arr={"23:59","00:00"};
        System.out.println(findMinDifference(List.of(arr)));
    }

    public static int findMinDifference(List<String> timePoints) {
        for (int i = 0; i < timePoints.size(); i++) {
            String[] time = timePoints.get(i).split(":");
            int hours = Integer.parseInt(time[0]);
            int minutes = Integer.parseInt(time[1]);
            int minPastMidnight = hours * 60 + minutes;
            timePoints.set(i, String.valueOf(minPastMidnight));
        }

        Collections.sort(timePoints, (a, b) -> Integer.parseInt(a) - Integer.parseInt(b));

        int res = 1440 + Integer.parseInt(timePoints.get(0)) - Integer.parseInt(timePoints.get(timePoints.size() - 1));
        for (int i = 1; i < timePoints.size(); i++) {
            int diff = Integer.parseInt(timePoints.get(i)) - Integer.parseInt(timePoints.get(i - 1));
            res = Math.min(res, diff);
        }

        return res;
    }
}
