public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(piles,8));

    }
    static int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = Integer.MIN_VALUE;
        for (int pile : piles) {
            j = Math.max(j, pile);
        }

        while (i < j) {
            int k = i + (j - i) / 2;
            int time = 0;
            for (int pile : piles) {
                time += (pile + k - 1) / k;
            }

            if (time > h) {
                i = k + 1;
            } else {
                j = k;
            }
        }

        return i;
    }

}
