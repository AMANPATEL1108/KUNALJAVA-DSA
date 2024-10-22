import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[]  nums={2,7,11,15};
        int target=9;

        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));


    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer j = visited.get(target - nums[i]);
            if (j != null) {
                return new int[] { j, i };
            }
            visited.put(nums[i], i);
        }   return nums;
    }
}
