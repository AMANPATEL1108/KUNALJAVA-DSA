import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    static int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[evenIndex++] = nums[i];
            } else {
                ans[oddIndex--] = nums[i];
            }
        }

        return ans;
    }
}
