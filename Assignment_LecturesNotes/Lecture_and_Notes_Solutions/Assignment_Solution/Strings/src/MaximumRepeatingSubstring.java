import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String str1="ababc";
        String str2="ab";

        System.out.println(maxRepeating(str1,str2));

    }



    public static int maxRepeating(String sequence, String word) {

            int count = sequence.split(word, -1).length - 1;

            return count;

    }
}
