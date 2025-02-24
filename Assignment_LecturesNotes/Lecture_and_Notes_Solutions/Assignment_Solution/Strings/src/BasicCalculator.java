public class BasicCalculator {
    public static void main(String[] args) {
    String s="1 + 1";
        System.out.println(calculate(s));
    }




    public static int calculate(String s) {
        return calc(s);

    }



    private static int calc(String s) {
        int i = 0;
        int num = 0, ans = 0, sign = 1;

        while (i < s.length()) {

            char ch = s.charAt(i++);

            if (Character.isDigit(ch))
                num = num * 10 + (ch - '0');

            else if (ch == '(')
                num = calc(s);

            else if (ch == ')')
                return ans + num * sign;

            else if (ch == '+' || ch == '-') {

                ans += num * sign;
                num = 0;
                sign = ch == '-' ? -1 : 1;
            }
        }

        return ans + num * sign;
    }
}
