import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }
    public static String largestNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrs, new Comparator<String>() {
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab);
            }
        });

        if (numStrs[0].equals("0")) return "0";

        String result = "";
        for (String numStr : numStrs) {
            result += numStr;
        }

        return result;
    }

}
