public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int ans=diagonalSum(matrix);
        System.out.println(ans);
    }
    static int diagonalSum(int[][] mat) {
        int sum=0;
        int n = mat.length;
        for(int i = 0; i <mat.length; i++){
            sum += mat[i][i];
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }
}
