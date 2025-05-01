public class FindXORSumofAllPairsBitwiseAND {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {6, 5};
        System.out.println(getXORSum(a, b));
    }

    public static int getXORSum(int[] arr1, int[] arr2) {
        return xorOp(arr1) & xorOp(arr2);
    }

    public static int xorOp(int[] arr) {
        int sum = 0;
        for (int a : arr) sum ^= a;
        return sum;
    }
}
