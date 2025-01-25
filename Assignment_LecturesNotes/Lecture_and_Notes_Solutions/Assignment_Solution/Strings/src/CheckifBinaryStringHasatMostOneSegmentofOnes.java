public class CheckifBinaryStringHasatMostOneSegmentofOnes {
    public static void main(String[] args) {

        String str = "1000";
        System.out.println(checkOnesSegment(str));

    }
    public static boolean checkOnesSegment(String s) {

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0') {
                return false;
            }
        }

        return true;
    }
}
