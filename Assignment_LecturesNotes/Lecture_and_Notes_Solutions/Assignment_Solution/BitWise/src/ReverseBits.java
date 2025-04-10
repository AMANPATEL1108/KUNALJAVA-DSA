public class ReverseBits {
    public static void main(String[] args) {
//    int a=00000010100101000001111010011100;
//        System.out.println(reverseBits(a));
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;
            result = (result << 1) | bit;
            n = n >>> 1;
        }
        return result;
    }
}
