import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInaMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);

    }


        static List<Integer> luckyNumbers(int[][] matrix) {
            List<Integer> newone = new ArrayList<>();
            int m = matrix.length;
            int n = matrix[0].length;

            for (int row = 0; row < m; row++) {
                int minCol = 0;
                for (int col = 0; col < n; col++) {
                    if (matrix[row][col] < matrix[row][minCol]) {
                        minCol = col;
                    }
                }

                boolean isLucky = true;
                for (int i = 0; i < m; i++) {
                    if (matrix[i][minCol] > matrix[row][minCol]) {
                        isLucky = false;
                        break;
                    }
                }

                if (isLucky) {
                    newone.add(matrix[row][minCol]);
                }
            }

            return newone;
        }

}
