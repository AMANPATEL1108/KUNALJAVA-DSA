import java.util.Arrays;

public class MajorityElement {
        public static void main(String[] args) {
    int[] arr={3,2,3};
            System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}