import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimumcosttoconnecttwogroupofpoints {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(Arrays.asList(15, 96));
        a.add(Arrays.asList(36, 2));
        System.out.println(connectTwoGroups(a));
    }

    static int Asize = 0;
    static int[][][] map;
   static int resultMask = 0;

    public static int connectTwoGroups(List<List<Integer>> cost) {
        Asize = cost.get(0).size();
        resultMask = (1 << (Asize)) - 1;
        map = new int[cost.get(0).size()][cost.size()][resultMask + 1];
        return helper(cost, 0, 0, 0);
    }

    static int helper(List<List<Integer>> cost, int i, int j, int mask) {

        if (i == cost.size() && mask == resultMask) {
            return 0;
        }
        int ans = 150000;
        if (j == Asize || i == cost.size()) {
            return ans;
        }

        if (map[j][i][mask] != 0) {
            return map[j][i][mask];
        }
        int temp1 = cost.get(i).get(j) + helper(cost, i + 1, 0, getMask(mask, j));
        int temp2 = helper(cost, i, j + 1, mask);
        int temp3 = cost.get(i).get(j) + helper(cost, i, j + 1, getMask(mask, j));

        ans = Math.min(temp3, Math.min(temp1, temp2));
        map[j][i][mask] = ans;
        return ans;
    }

   static int getMask(int mask, int j) {
        int temp = 1 << j;
        mask = mask | temp;
        return mask;
    }
}
