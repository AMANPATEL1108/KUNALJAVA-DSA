import java.util.Arrays;

public class CellswithOddValuesinaMatrix {
    public static void main(String[] args) {
        int[][] array={{0,1},{1,1}};
        int m=2;
        int n=3;
        System.out.println(oddCells(m,n,array));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }

            for (int j = 0; j < m; j++) {
                matrix[j][col]++;
            }
        }



        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
