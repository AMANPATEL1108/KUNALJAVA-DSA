import java.util.Arrays;

public class ReshapetheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalRows = mat.length;
        int originalCols = mat[0].length;

        if (r * c != originalRows * originalCols) {
            return mat;
        }

        int[][] arr = new int[r][c];
        int[] simple = new int[originalRows * originalCols];
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                simple[count] = mat[i][j];
                count++;
            }
        }

        count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = simple[count];
                count++;
            }
        }

        return arr;
    }
}
