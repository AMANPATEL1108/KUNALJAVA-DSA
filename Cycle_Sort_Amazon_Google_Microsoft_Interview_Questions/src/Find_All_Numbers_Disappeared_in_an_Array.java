import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans=findDisappearedNumbers(arr);
        System.out.println(ans);

    }
     static List<Integer> findDisappearedNumbers(int[] arr) {

        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                Swap(arr,i,correct);
            }else {
                i++;
            }
        }

    //just find missing number
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    static  void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
