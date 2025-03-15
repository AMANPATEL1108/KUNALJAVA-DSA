public class decodestring {
    public static void main(String[] args) {
    String a="3[a]2[bc]";
        System.out.println(decodeString(a));
    }

    static int idx = -1;

    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        dfs(s, result);
        return result.toString();
    }

    private static void dfs(String str, StringBuilder currStr) {
        idx++;
        if (idx == str.length() || str.charAt(idx) == ']') {
            return;
        }

        if (Character.isDigit(str.charAt(idx))) {
            int multip = 0;
            while (Character.isDigit(str.charAt(idx))) {
                multip = multip * 10 + str.charAt(idx) - '0';
                idx++;
            }

            StringBuilder newStr = new StringBuilder();
            dfs(str, newStr);

            while (multip > 0) {
                currStr.append(newStr);
                multip--;
            }

            dfs(str, currStr);
        } else if (Character.isLetter(str.charAt(idx))) {
            currStr.append(str.charAt(idx));
            dfs(str, currStr);
        }
    }
}
