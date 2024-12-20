import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
int[] arr={2,1,2};
        System.out.println(largestPerimeter(arr));
    }

    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];
            if (a + b > c) {
                return a + c + b ;
            }
        }
        return 0;
    }
}
