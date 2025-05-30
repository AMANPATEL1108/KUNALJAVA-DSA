public class UniquePaths {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println(uniquePaths(a, b));
    }

    public static int uniquePaths(int m, int n) {
        long[][] dp = new long[m + 1][n + 1];
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 0; i < n; i++) dp[0][i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return (int) dp[m - 1][n - 1];
    }
}
