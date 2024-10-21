import java.lang.reflect.Array;
import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] targaet={{1,1,1},{0,1,0},{0,0,0}};
        boolean ans=findRotation(mat,targaet);
        System.out.println(ans);
    }
    static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate90Degrees(mat);  // Rotate the matrix by 90 degrees
        }
        return false;
    }


    static int[][] rotate90Degrees(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = mat[i][j];
            }
        }
        return rotated;
    }
}
