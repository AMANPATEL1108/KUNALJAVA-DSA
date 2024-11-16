public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] arr={1,3,5,6};
        int t=2;
        System.out.println(searchInsert(arr,t));


    }

    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

}
