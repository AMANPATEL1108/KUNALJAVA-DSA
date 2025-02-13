public class NumberofSubstringsWithOnly1s {
    public static void main(String[] args) {
        String s="0110111";
        System.out.println(numSub(s));
    }

    public static int numSub(String s) {
        int count = 0, total = 0, mod = 1_000_000_007;

        for (char c : s.toCharArray()) {
            count = (c == '1') ? count + 1 : 0;
            total = (total + count) % mod;
        }

        return total;
    }
}
