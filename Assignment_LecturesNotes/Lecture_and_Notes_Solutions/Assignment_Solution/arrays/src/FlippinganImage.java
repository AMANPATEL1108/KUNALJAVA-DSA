import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {

        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
//        int[][] rev=reverseArray(image);
//        System.out.println(Arrays.deepToString(rev));
        int[][] ans =flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));

    }


    static int[][] flipAndInvertImage(int[][] image) {
        int[][] rev=reverseArray(image);
        int[][] newarr=new int[rev.length][rev.length];
        for(int row = 0; row <rev.length; row++){
            for(int col = 0; col <rev.length;col++){
                if (rev[row][col]==1){
                    newarr[row][col]=0;
                }
                if (rev[row][col]==0) {
                    newarr[row][col]=1;
                }
            }
        }
        return newarr;
    }

    static int[][] reverseArray(int[][] arr) {

        for (int i = 0; i < arr.length ; i++) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        return arr;
    }
}
