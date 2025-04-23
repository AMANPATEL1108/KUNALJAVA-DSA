import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(subsets(a));
    }

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> big = new ArrayList<>();

        subset(arr, 0, new ArrayList<Integer>(), big);
        return big;

    }

    public static void subset(int[] arr, int vidx, List<Integer> temp, List<List<Integer>> big) {
        if (vidx == arr.length) {
            big.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[vidx]);
        subset(arr, vidx + 1, temp, big);

        temp.remove(temp.size() - 1);
        subset(arr, vidx + 1, temp, big);
    }
}
