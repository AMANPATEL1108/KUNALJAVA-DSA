public class MaximumSubarray {
    public static void main(String[] args) {
        int[] anums={-2,1,-3,4,-1,2,1,-5,4};
        int ans=maxSubArray(anums);
        System.out.println(ans);
    }

    static int maxSubArray(int[] nums) {
        int res = nums[0];
        int maxEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {

            maxEnding = Math.max(maxEnding + nums[i], nums[i]);

            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
