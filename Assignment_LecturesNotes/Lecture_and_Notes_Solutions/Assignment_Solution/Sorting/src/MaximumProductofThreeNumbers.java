import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {-100, -98, -1, 2, 3, 4};
        System.out.println(maximumProduct(arr));
    }

    static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n-1] * nums[n-2] * nums[n-3];

        int product2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(product1, product2);
    }
}