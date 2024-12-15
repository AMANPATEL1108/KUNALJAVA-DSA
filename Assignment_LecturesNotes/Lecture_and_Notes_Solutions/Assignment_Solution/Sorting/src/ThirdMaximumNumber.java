import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(thirdMax(arr));
    }

    static int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (n < 3) {
            return nums[n - 1];
        }

        int count = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;
            }
            if (count == 3) {
                return nums[i];
            }
        }

        return nums[n - 1];
    }
}
