import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {

        int[] a={1,2,2};
        System.out.println(subsetsWithDup(a));

    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, 0, new ArrayList<>(), mainList);
        return mainList;
    }

    private static void subset(int[] nums, int start, List<Integer> list, List<List<Integer>> mainList) {
        mainList.add(new ArrayList<>(list));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;

            list.add(nums[i]);
            subset(nums, i + 1, list, mainList);
            list.remove(list.size() - 1);
        }
    }
}
