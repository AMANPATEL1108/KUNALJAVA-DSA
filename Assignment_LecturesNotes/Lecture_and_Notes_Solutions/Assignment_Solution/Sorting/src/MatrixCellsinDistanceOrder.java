import java.util.Arrays;

public class MatrixCellsinDistanceOrder {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int rCenter = 0;
        int cCenter = 0;
        int[][] ans=allCellsDistOrder(rows,cols,rCenter,cCenter);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows * cols][2];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[index][0] = i;
                ans[index][1] = j;
                index++;
            }
        }

        Arrays.sort(ans, (a, b) -> {
            int distA = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int distB = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return Integer.compare(distA, distB);
        });

        return ans;
    }
}
