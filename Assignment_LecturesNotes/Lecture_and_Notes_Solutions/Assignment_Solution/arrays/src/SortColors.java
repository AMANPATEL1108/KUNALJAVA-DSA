import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        sortColors(arr);

    }

    static void sortColors(int[] nums) {
        for(int j=0;j< nums.length;j++){
        for (int i = 1; i <= nums.length-1; i++) {
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
        }
        System.out.println(Arrays.toString(nums));
    }
}
