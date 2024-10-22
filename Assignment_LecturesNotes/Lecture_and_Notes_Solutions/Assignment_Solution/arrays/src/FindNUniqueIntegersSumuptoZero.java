import java.util.Arrays;
import java.util.Random;

public class FindNUniqueIntegersSumuptoZero {
    public static void main(String[] args) {
        int n = 9;
        int[] ans = sumZero(n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumZero(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n / 2; i++) {
            arr[i] = i + 1;
            arr[n - 1 - i] = -(i + 1);
        }

        if (n % 2 != 0) {
            arr[n / 2] = 0;
        }

        return arr;
    }
}