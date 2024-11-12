import java.util.Arrays;

public class TwoSum_II_Inputarrayissorted {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] ans=twoSum(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] twoSum(int[] numbers, int target) {
    int start=0,end=numbers.length-1;
    while (start<end){
        if (numbers[start]+numbers[end]>target){
            end--;

        }else if (numbers[start]+numbers[end]<target){
            start++;
        }else{
            return new int[]{start+1,end+1};
        }
    }
    return new int[]{};
    }
}
