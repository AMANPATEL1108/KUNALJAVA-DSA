import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };

        int target=56;
//        int[] ans=search(arr,target); //formate of return value{row,col}
//        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }



    //maximum item    find
    static int max(int[][] arr){

int max=Integer.MIN_VALUE;
            for(int row=0;row< arr.length;row++){
                for(int col=0;col<arr[row].length;col++){
                    if(max<arr[row][col]){
                       max=arr[row][col];
                    }
                }
            }
            return max;
        }

    //find array position
    static int[] search(int[][] arr,int target){


        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }



}
