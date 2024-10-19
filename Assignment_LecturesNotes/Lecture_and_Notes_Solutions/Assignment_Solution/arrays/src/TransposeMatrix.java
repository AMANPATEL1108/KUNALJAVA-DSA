import java.util.Arrays;

    public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans=transpose(arr);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] transpose(int[][] arr) {
        int newarr[][]=new int[arr[0].length][arr.length];

        for(int row=0;row<arr.length;row++){
            for(int col=0;col< arr[0].length;col++){
               newarr[col][row]=arr[row][col];
            }
        }
        return newarr;
    }
}
