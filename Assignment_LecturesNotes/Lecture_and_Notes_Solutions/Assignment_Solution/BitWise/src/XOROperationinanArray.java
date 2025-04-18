public class XOROperationinanArray {
    public static void main(String[] args) {
    int n=5;
    int start=0;
        System.out.println(xorOperation(n,start));
    }

    public static int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            xor ^= num;
        }
        return xor;
    }
}
