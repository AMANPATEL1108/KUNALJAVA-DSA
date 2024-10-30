import java.util.Arrays;

public class SpiralMatrixIII {
    public static void main(String[] args) {
        int rows=1;
        int cols=4;
        int rStart=0;
        int cStart=0;

        int[][] ans=spiralMatrixIII(rows,cols,rStart,cStart);
        System.out.println(Arrays.deepToString(ans));

    }

    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int index = 0;
        int[] directionsRow = {0, 1, 0, -1};
        int[] directionsCol = {1, 0, -1, 0};

        int x = rStart, y = cStart;
        int direction = 0, steps = 1;

        result[index++] = new int[]{x, y};

        while (index < rows * cols) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < steps; j++) {
                    x += directionsRow[direction];
                    y += directionsCol[direction];

                    if (x >= 0 && x < rows && y >= 0 && y < cols) {
                        result[index++] = new int[]{x, y};
                    }
                }
                direction = (direction + 1) % 4;
            }
            steps++;
        }

        return result;
    }

}
