public class Searcha2DMatrix {
    public static void main(String[] args) {
    int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target=3;
        System.out.println(searchMatrix(arr,target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
