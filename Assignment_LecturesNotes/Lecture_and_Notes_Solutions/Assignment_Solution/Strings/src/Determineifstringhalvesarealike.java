import java.util.HashSet;
import java.util.Set;

public class Determineifstringhalvesarealike {
    public static void main(String[] args) {
    String str="book";
        System.out.println(halvesAreAlike(str));
    }
    public static boolean halvesAreAlike(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int countFirstHalf = 0;
        int countSecondHalf = 0;
        int halfLength = s.length() / 2;

        for (int i = 0; i < halfLength; ++i) {
            if (isVowel(s.charAt(i))) {
                countFirstHalf++;
            }
        }

        for (int i = halfLength; i < s.length(); ++i) {
            if (isVowel(s.charAt(i))) {
                countSecondHalf++;
            }
        }
        return countFirstHalf == countSecondHalf;
    }

        public static boolean isVowel(char c) {
            Set<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');
            return vowels.contains(c);
            }
}
