import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }

    static int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int oddIndex = 1, evenIndex = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                ans[evenIndex] = num;
                evenIndex += 2;
            } else {
                ans[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return ans;
    }
}
