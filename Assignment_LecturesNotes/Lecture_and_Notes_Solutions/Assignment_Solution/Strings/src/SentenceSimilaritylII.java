import java.util.SimpleTimeZone;

public class SentenceSimilaritylII {
    public static void main(String[] args) {

        String name="My name is Haley";
        String b="My Haley";
        System.out.println(areSentencesSimilar(name,b));
    }

        public static boolean areSentencesSimilar(String sentence1, String sentence2) {

            String[] word1 = sentence1.split(" ");
            String[] word2 = sentence2.split(" ");

            if (word1.length > word2.length) {
                return areSentencesSimilar(sentence2, sentence1);
            }

            int i = 0;
            while (i < word1.length && word1[i].equals(word2[i])) {
                i++;
            }

            while (i < word1.length && word1[i].equals(word2[i + word2.length - word1.length])) {
                i++;
            }

            return i == word1.length;


    }
}
