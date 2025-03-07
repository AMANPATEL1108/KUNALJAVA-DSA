import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
            int target=7;
            int[] arr={2,3,6,7};
        System.out.println(combinationSum(arr,target));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        combination(candidates, target, 0, new ArrayList<>(), 0, ans);

        return ans;
    }
    private static void combination(int[] candidates, int target, int idx, List<Integer> comb, int total,
                             List<List<Integer>> ans) {
        if (total == target) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || idx >= candidates.length)
            return;

        comb.add(candidates[idx]);
        combination(candidates, target, idx, comb, total + candidates[idx], ans);

        comb.remove(comb.size() - 1);
        combination(candidates, target, idx + 1, comb, total, ans);
    }
}
