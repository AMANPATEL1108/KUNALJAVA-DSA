public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return -1;
    }
}
