import java.lang.reflect.Array;
import java.util.Arrays;

public class RichestPerson {
    public static void main(String[] args) {
            int[][] account={{1,2,3},{3,1,1}};
            int ans=maximumWealth(account);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //new columb new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            //now we have sum of accounts person
            //check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}
