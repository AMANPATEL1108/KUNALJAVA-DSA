import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
    int[] nums={1,0,-1,0,-2,2};
    int target=0;
        System.out.println(fourSum(nums, target));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<String> unique = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int li = j + 1;
                int ri = nums.length - 1;

                while (li < ri) {
                    long sum = (long) nums[i] + nums[j] + nums[li] + nums[ri];

                    if (sum < target) {
                        li++;
                    } else if (sum > target) {
                        ri--;
                    } else {
                        StringBuffer sb = new StringBuffer();
                        sb.append(nums[i]);
                        sb.append(nums[j]);
                        sb.append(nums[li]);
                        sb.append(nums[ri]);
                        String code = sb.toString();

                        if (!unique.contains(code)) {
                            unique.add(code);
                            res.add(Arrays.asList(nums[i], nums[j], nums[li], nums[ri]));
                        }
                        li++;
                        ri--;
                    }
                }
            }
        }

        return res;
    }
}
