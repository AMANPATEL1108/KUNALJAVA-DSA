import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=546;
//        arr[3]=455;
//        arr[4]=566;

//        System.out.println(arr[3]);

        //input using for loop

//        for(int i=0;i<=arr.length-1;i++){
//            arr[i]=sc.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));  //print array
//       for(int i=0;i<=arr.length-1;i++){
//           System.out.print(arr[i]+" ");    //print array
//       }
//        for(int num:arr){ //every element Print  //print array
//            System.out.print(num+" ");
//        }

        //arrays of Primitivrs
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));


    }
}
