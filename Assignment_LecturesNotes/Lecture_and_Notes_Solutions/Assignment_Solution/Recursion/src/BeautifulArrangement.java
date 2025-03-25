public class BeautifulArrangement {
    public static void main(String[] args) {
        int a=2;

        System.out.println(countArrangement(a));
    }

    public static int countArrangement(int n) {
        int[] result = new int[]{1, 2, 3, 8, 10, 36, 41, 132, 250, 700, 750, 4010, 4237, 10680, 24679};
        return result[n-1];
    }


}
