public class FindMinimuminRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr={1,3,5};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if (min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
}
