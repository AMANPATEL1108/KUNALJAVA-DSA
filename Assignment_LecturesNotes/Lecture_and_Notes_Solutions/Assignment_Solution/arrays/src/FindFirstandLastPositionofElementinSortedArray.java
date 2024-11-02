import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {

        int[] nums={5,7,7,8,8,10};
        int target=8;
        int ans[]=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
