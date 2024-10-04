import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] ans=findErrorNums(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] findErrorNums(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if ( arr[i]!=arr[correct]){

                Swap(arr,i,correct);
            }else {
                i++;
            }
        }
        //first missing number
        for(int index=0;index<arr.length;index++){
            if (arr[index] != index+1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static  void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
