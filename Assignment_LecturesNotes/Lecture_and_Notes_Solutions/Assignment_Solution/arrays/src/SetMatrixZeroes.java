import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        int[][] ans=setZeroes(arr);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] setZeroes(int[][] matrix) {
        ArrayList<int[]> zeroPositions = new ArrayList<>();

        for(int row=0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if (matrix[row][col] == 0){
                    zeroPositions.add(new int[]{row, col});
                }
            }
        }

        for(int i = 0; i < zeroPositions.size(); i++) {
            int row = zeroPositions.get(i)[0];
            int col = zeroPositions.get(i)[1];

            for(int j = 0; j < matrix[0].length; j++){
                matrix[row][j] = 0;
            }
            for(int j = 0; j < matrix.length; j++){
                matrix[j][col] = 0;
            }
        }

        return matrix;
    }
}
