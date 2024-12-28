import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] small = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            small[i] = count;
        }
        return small;
    }
}
