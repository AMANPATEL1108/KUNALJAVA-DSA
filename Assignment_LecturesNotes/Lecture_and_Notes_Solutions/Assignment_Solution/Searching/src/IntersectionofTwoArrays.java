import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> newarr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!newarr.contains(nums1[i])) {
                        newarr.add(nums1[i]);
                    }
                    break;
                }
            }
        }

        int[] result = new int[newarr.size()];
        for (int i = 0; i < newarr.size(); i++) {
            result[i] = newarr.get(i);
        }

        return result;
    }
}
