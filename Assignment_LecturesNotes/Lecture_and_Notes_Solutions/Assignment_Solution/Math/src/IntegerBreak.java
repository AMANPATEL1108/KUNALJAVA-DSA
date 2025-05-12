public class IntegerBreak {
    public static void main(String[] args) {
    int a=2;
        System.out.println(integerBreak(a));
    }

    public static int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int threes = n / 3;
        if (n % 3 == 0) {
            return (int) Math.pow(3, threes);
        } else if (n % 3 == 1) {
            return (int) Math.pow(3, threes - 1) * 4;
        } else {
            return (int) Math.pow(3, threes) * 2;

        }
    }
}
