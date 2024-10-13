public class CheckSentencePangram {
    public static void main(String[] args) {
        String a="leetcode";
        System.out.println(checkIfPangram(a));
    }

    static boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++){
            if (sentence.indexOf(ch)<0){
                return false;
            }
        }

        return true;
    }
}
