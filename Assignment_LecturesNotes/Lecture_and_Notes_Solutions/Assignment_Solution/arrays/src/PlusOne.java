import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}
