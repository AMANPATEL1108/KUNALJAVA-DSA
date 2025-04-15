public class BinaryNumberwithAlternatingBits {
    public static void main(String[] args) {
    int a=5;
        System.out.println(hasAlternatingBits(a));
    }

    public static boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        return (n & n + 1) == 0;
    }
}
