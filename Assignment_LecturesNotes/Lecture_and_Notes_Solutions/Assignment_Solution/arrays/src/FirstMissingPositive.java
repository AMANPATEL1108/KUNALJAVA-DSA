import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] == ans + 1) {
                ans = nums[i];
            }
        }

        return ans + 1;
    }
}
