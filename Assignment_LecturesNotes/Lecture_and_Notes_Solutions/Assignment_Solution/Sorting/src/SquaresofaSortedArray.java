import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] arr={ -4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    static int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        Arrays.sort(nums);


        return nums;
    }
}
