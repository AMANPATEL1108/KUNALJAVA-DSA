import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value:");
//        int[] arr=new int[10];
//        for(int i=0;i<=arr.length-1;i++){
//             arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr={18,12,9,14,77,50};
        int find=77;
        int ans= LinearSearch(arr,find);
        int ans2= LinearSearch2(arr,find);
        boolean ans3= LinearSearch3(arr,find);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);

    }

    static boolean LinearSearch3 (int[] arr,int find){
        if (arr.length==0){
            return false;
        }
        for(int i=0;i< arr.length;i++){
            if (arr[i]==find){
                return true;
            }
        }
        return false;
    }


    static int LinearSearch2 (int[] arr,int find){
        if (arr.length==0){
            return  -1;
        }
        for(int i=0;i< arr.length;i++){
            if (arr[i]==find){
                return arr[i];
            }
        }
        return -1;
    }


    static int LinearSearch (int[] arr,int find){
        if (arr.length==0){
            return  -1;
        }
        for(int i=0;i< arr.length;i++){
            if (arr[i]==find){
                return i;
            }
        }
        return -1;
    }

}