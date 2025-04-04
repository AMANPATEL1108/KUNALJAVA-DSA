import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordbreakII {
    public static void main(String[] args) {

        String a="catsanddog";
        List<String> b = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        System.out.println(wordBreak(a,b));
    }

     static List<String>  results;
     static HashSet<String> dict;
    public static List<String> wordBreak(String s, List<String> wordDict) {
        results = new ArrayList<>();
        dict = new HashSet<String>();
        for(String word: wordDict)dict.add(word);
        backTrack(s,0,new StringBuilder());
        return results;

    }

    public static void backTrack(String s, int start, StringBuilder currentSentence){
        if(start==s.length()) results.add(currentSentence.toString().trim());
        for(int i = start; i<s.length();i++){
            if(dict.contains(s.substring(start,i+1))) {
                int len = currentSentence.length();
                currentSentence.append(s.substring(start,i+1));
                currentSentence.append(" ");
                backTrack(s,i+1,currentSentence);
                currentSentence.setLength(len);
            }
        }
    }

}
