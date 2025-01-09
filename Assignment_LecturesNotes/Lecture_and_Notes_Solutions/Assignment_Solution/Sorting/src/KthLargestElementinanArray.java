public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(arr,k));
    }
    static int findKthLargest(int[] nums, int k) {
        int[] count = new int[20001];

        for (int num : nums)
            count[num + 10000]++;

        for (int i = count.length - 1; i >= 0; i--)
            if (count[i] > 0) {
                k -= count[i];
                if (k <= 0) return i - 10000;
            }

        return -1;
    }
}
