public class DivideChocolate {
    public static void main(String[] args) {
        DivideChocolate solution = new DivideChocolate();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int m = 4;
        int result = solution.maximizeSweetness(arr, m);
        System.out.println("Maximum sweetness: " + result);
    }

    public int maximizeSweetness(int[] nums, int m) {
        m++;
        long l = Integer.MAX_VALUE, r = 0;
        for (int n : nums) {
            r += n;
            l = Math.min(l, n);
        }
        while (l + 1 < r) {
            long mid = l + (r - l) / 2;
            if (canSplit(nums, m, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (canSplit(nums, m, r)) {
            return (int) r;
        } else {
            return (int) l;
        }
    }

    public boolean canSplit(int[] nums, int m, long target) {
        long sum = 0, cnt = 0;
        for (int n : nums) {
            if (sum + n >= target) {
                sum = 0;
                cnt++;
            } else {
                sum += n;
            }
        }
        return cnt >= m;
    }
}
