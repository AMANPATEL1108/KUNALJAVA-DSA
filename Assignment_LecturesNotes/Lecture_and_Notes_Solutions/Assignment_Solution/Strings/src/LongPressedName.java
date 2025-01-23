import java.util.ArrayList;
import java.util.Arrays;

public class LongPressedName {
    public static void main(String[] args) {
        String str1="alex";
        String str2="aaleex";
        System.out.println(isLongPressedName(str1,str2));


    }
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }
}
