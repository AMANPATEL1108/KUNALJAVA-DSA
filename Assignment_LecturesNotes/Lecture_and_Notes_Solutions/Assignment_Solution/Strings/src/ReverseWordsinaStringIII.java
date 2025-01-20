import java.util.ArrayList;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();

        for(String word: words){
            StringBuilder revWords = new StringBuilder(word);

            res.append(revWords.reverse());
            res.append(" ");
        }
        return res.toString().trim();
    }

}

