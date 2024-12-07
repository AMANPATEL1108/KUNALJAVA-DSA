import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int[] stalls = new int[N];

            for (int i = 0; i < N; i++) {
                stalls[i] = sc.nextInt();
            }


            Arrays.sort(stalls);

            int low = 1;
            int high = stalls[N - 1] - stalls[0];
            int result = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (canPlaceCows(stalls, C, mid)) {
                    result = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }

    static boolean canPlaceCows(int[] stalls, int C, int minDist) {
        int count = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;
                lastPosition = stalls[i];

                if (count == C) {
                    return true;
                }
            }
        }

        return false;  // Could not place all cows
    }
}
