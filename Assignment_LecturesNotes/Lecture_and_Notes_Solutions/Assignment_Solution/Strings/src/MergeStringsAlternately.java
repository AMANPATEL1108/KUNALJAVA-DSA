public class MergeStringsAlternately {
    public static void main(String[] args) {

        String w1="ab";
        String w2="pqrs";
        System.out.println(mergeAlternately(w1,w2));
    }

    public static String mergeAlternately(String word1, String word2) {

        String ans="";
        int len;

        if (word1.length()<=word2.length()){
            len=word2.length();
        }else {
            len=word1.length();
        }

      for(int i=0;i<len;i++){
          if (i < word1.length()) {
              ans += word1.charAt(i);
          }
          if (i < word2.length()) {
              ans += word2.charAt(i);
          }
      }


      return ans;
    }
}
