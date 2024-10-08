import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] newans = buildArray(nums);
        System.out.println(Arrays.toString(newans));
    }

    static int[] buildArray(int[] nums) {
        int sz = nums.length;
        int[] ans = new int[sz];


        for (int i = 0; i < sz; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
