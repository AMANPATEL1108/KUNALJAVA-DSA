import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr){
        boolean swapped;
            for(int i=0;i<arr.length;i++){
                swapped=false;
                //--------
                for(int j=1;j<arr.length-i;j++){
                //-------------------------------
                //swap of item smaller then previous
                    if (arr[j]<arr[j-1]){
                        //swap
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                    }
                }
                if (!swapped){ //not!false =true;
                    break;
                }
            }
    }
}