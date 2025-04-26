public class DivideTwoIntegers {
    public static void main(String[] args) {

        int a=10;
        int b=3;
        System.out.println(divide(a,b));;

    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        double ans = (dividend / divisor);
        int ans1 = (int) ans;
        return ans1;
    }
}
