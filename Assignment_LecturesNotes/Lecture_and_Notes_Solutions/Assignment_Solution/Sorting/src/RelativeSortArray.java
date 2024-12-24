import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};

        int[] ans = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int[] ans1 = new int[arr1.length];
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    ans1[count++] = arr1[j];
                }
            }
        }
        System.out.println(Arrays.toString(ans1));

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans1[count++] = arr1[i];
            }
        }

        return ans1;
    }
}
