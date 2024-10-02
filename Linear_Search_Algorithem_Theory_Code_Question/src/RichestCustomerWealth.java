//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{9,1,6},{3,3,7}};
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {
//        person=row
//        account=col
        int ans=Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //new columb new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            //now we have sum of accounts person
            //check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}
