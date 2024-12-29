import java.util.Arrays;

public class MaximumProductofTwoElementinanArray {
    public static void main(String[] args) {
    int[] arr={3,4,5,2};
        System.out.println(maxProduct(arr));

    }

    static int maxProduct(int[] nums) {

        Arrays.sort(nums);
        int a = nums[nums.length - 1] - 1;
        int b=nums[nums.length-2]-1;

        return  a*b;

    }
}
