public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(nums[left] > nums[right]){
            int mid = left + (right - left)/2;

            if(nums[mid+1] < nums[mid]){
                return nums[mid+1];
            }
            if(nums[mid-1] > nums[mid]){
                return nums[mid];
            }

            if(nums[mid] < nums[right]){
                right = mid - 1;
            }
            if(nums[mid] > nums[left]){
                left = mid + 1;
            }
        }

        return nums[left];

    }

}
