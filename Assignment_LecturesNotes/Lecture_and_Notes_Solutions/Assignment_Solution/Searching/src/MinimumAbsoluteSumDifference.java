import java.util.Arrays;

public class MinimumAbsoluteSumDifference {
    public static void main(String[] args) {
        int[] nums1 = {1, 10, 4, 4, 2, 7};
        int[] nums2 = {9, 3, 5, 1, 7, 4};
        System.out.println(minAbsoluteSumDiff(nums1, nums2));
    }

    static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int mod = (int) 1e9 + 7;
        int replace = 0;
        int save;
        int currDiff;
        int sumDiff = 0;
        for (int i = 0; i < nums1.length; i++) {
            currDiff = Math.abs(nums1[i] - nums2[i]);
            sumDiff = (sumDiff + currDiff) % mod;
            if (replace < currDiff) {
                for (int j : nums1) {
                    save = currDiff - Math.abs(j - nums2[i]);
                    if (save > replace) {
                        replace = save;
                    }
                    if (replace == currDiff) {
                        break;
                    }
                }
            }
        }
        return (sumDiff - replace + mod) % mod;
    }
}
