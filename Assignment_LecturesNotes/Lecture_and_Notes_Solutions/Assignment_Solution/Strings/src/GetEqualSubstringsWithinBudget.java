public class GetEqualSubstringsWithinBudget {
    public static void main(String[] args) {
        String a="abcd";
        String b="bcdf";
        int c=3;
        System.out.println(equalSubstring(a,b,c));
    }

    public  static int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int i = 0, j = 0, ans = 0, curCost = 0;

        while (j < n) {
            curCost += Math.abs(t.charAt(j) - s.charAt(j));
            while (i < n && curCost > maxCost) {
                curCost -= Math.abs(t.charAt(i) - s.charAt(i));
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }

        return ans;
    }
}
