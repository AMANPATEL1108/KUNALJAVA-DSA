public class SingleNumber {
    public static void main(String[] args) {
    int[] a={2,2,1};
        System.out.println(singleNumber(a));
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;

        for (int i : nums) {
            xor ^= i;
        }

        return xor;
    }


}
