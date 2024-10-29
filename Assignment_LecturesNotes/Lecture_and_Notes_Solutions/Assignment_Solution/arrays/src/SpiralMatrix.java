import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);
    }

        static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();

            if (matrix == null || matrix.length == 0) {
                return ans;
            }

            int top = 0, bottom = matrix.length - 1;
            int left = 0, right = matrix[0].length - 1;

            while (top <= bottom && left <= right) {
                for (int j = left; j <= right; j++) {
                    ans.add(matrix[top][j]);
                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;

                if (top <= bottom) {
                    for (int j = right; j >= left; j--) {
                        ans.add(matrix[bottom][j]);
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return ans;
        }
}
