import java.util.HashMap;

public class BinaryGap {
    public static void main(String[] args) {
    int n=22;
        System.out.println(binaryGap(n));
    }

    public static int binaryGap(int n) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                if (map.containsKey(1)) {
                    max = Math.max(max, (i - map.get(1)));
                }
                map.put(1, i);
            }
        }
        return max;
    }
}
