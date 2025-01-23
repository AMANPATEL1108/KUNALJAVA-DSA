public class ImplementstrStr {
    public static void main(String[] args) {
        String s1="sadbutsad";
        String s2="sad";
        System.out.println(strStr(s1,s2));
    }
    public static  int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;

    }
}
