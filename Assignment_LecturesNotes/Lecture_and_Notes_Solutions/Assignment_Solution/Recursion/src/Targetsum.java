public class Targetsum {
    public static void main(String[] args) {

        int[] a={1,1,1,1,1};
        int t=3;
        System.out.println(findTargetSumWays(a,t));

    }

    public static int findTargetSumWays(int[] nums, int target) {
        return cal(nums, target, 0, 0);
    }
    public static int cal(int[] nums, int tar, int idx, int currSum) {
        if (idx == nums.length) {
            return (currSum == tar) ? 1 : 0;
        }

        int add = cal(nums, tar, idx + 1, currSum + nums[idx]);
        int sub = cal(nums, tar, idx + 1, currSum - nums[idx]);

        return add + sub;
    }
}
