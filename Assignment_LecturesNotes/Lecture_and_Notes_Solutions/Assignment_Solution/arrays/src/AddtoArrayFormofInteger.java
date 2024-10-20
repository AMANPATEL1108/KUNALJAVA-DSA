import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        int[] num={1,2,1,0};
        int k=32;
        List<Integer> ans=addToArrayForm(num,k);
        System.out.println(ans);
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }

            result.add(0, k % 10);
            k /= 10;

            i--;
        }

        return result;
    }
}
