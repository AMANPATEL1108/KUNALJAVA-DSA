import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        1 2 3
//        4 5 6
//        7 8 9
//

//        int[][] arr=new int[3][3];
//        int[][] arr={ {1,2,3},
//                      {4,5,6},
//                      {7,8,9}
//                    };
//        int[][] arr={
//                {1,2,3}, //0 index
//                {4,5}, //first Index
//                {6,7,8,9} //second Index
//        };

        int[][] arr = new int[3][3];

        System.out.println(arr.length);


        // Input

//        for every row
        for (int row = 0; row < arr.length; row++) {
            // for each column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }


        // Output


//        for (int row = 0; row < arr.length; row++) {
//            // for each column
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }

//        for(int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
