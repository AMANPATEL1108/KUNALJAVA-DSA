public class Practice_WordCount {

    public static void main(String[] args) {
        // Test the function with a sample sentence
        String sentence = "    Hello world this is           Java        ";
        countWordsAndStore(sentence);
    }


     static void countWordsAndStore(String sentence) {
        String[] words = new String[100];
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ' || i == sentence.length() - 1) {
                if (currentWord.length() > 0) {
                    words[wordCount] = currentWord;
                    wordCount++;
                    currentWord = "";
                }
            } else {
                currentWord += ch;
            }
        }

        System.out.println("The number of words in the sentence: " + wordCount);


    }


}
