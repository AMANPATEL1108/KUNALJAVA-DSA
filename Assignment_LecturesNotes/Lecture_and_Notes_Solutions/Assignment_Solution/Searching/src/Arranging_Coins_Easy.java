public class Arranging_Coins_Easy {
    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangeCoins(n));

    }
    static int arrangeCoins(int n) {
        int i = 1;
        while (n > 0) {
            i ++;
            n -= i;
        }
        return i - 1;
    }
}
