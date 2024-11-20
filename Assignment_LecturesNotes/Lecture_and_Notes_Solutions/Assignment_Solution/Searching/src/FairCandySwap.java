import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        int[] ans=fairCandySwap(aliceSizes,bobSizes);
        System.out.println(Arrays.toString(ans));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int SumA = 0;
        int SumB = 0;
        Set<Integer> setB = new HashSet<>();

        for (int a : aliceSizes) {
            SumA += a;
        }
        for (int b : bobSizes) {
            SumB += b;
            setB.add(b);
        }
        int diff = (SumB - SumA) / 2;

        for (int a : aliceSizes) {
            if (setB.contains(a + diff)) {
                return new int[]{a, a + diff};
            }
        }
        return new int[]{0, 0};
    }
}

