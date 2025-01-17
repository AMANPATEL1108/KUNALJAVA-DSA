public class DecryptStringfromAlphabetoIntegerMapping {
    public static void main(String[] args) {
        String str = "10#11#12";
        System.out.println(freqAlphabets(str));
    }

    public static String freqAlphabets(String s) {
        char c;
        String newstr = "";

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                newstr += (char) ('j' + Integer.parseInt(s.substring(i, i + 2)) - 10);
                i += 2;
            } else {
                newstr += (char) ('a' + (s.charAt(i) - '1'));
            }
        }

        return newstr;
    }
}
