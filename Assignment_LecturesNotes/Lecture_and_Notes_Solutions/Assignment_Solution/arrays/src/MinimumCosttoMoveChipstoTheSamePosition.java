public class MinimumCosttoMoveChipstoTheSamePosition {

    public static void main(String[] args) {
        int[] Position={1,2,3};
        int ans=minCostToMoveChips(Position);
        System.out.println(ans);

    }
    static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int chips : position) {
            if(chips % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}

