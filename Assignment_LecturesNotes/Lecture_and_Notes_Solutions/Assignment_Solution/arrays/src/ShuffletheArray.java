import java.util.Arrays;
import java.util.Scanner;

public class ShuffletheArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int n=3;
        int[] ans=shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }

     static int[] shuffle(int[] nums, int n) {
        int result[]=new int[nums.length];
        int indx=0;

        for(int i=0;i<n;i++) {

                result[indx++] = nums[i];
                result[indx++] = nums[i+n];
        }
        return result;
    }
}
