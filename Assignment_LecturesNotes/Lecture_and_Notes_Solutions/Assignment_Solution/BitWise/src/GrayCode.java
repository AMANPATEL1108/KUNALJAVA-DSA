import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        int a=2;
        System.out.println(grayCode(a));
    }

    public static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < (1 << n); i++) {
            num ^= i & (-i);
            ans.add(num);
        }
        return ans;
    }
}
