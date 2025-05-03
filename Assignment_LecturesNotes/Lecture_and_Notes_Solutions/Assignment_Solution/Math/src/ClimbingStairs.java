import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) {
    int a=2;
        System.out.println(climbStairs(a));

    }

        public static int climbStairs(int n) {
            Map<Integer, Integer> memo = new HashMap<>();
            memo.put(1, 1);
            memo.put(2, 2);
            return climbStairs(n, memo);
        }

        private static int climbStairs(int n, Map<Integer, Integer> memo) {
            if (memo.containsKey(n)) {
                return memo.get(n);
            }
            memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
            return memo.get(n);
        }
}
