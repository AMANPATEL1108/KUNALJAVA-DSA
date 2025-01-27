import java.util.ArrayList;

public class ReversePrefixofWord {
    public static void main(String[] args) {
    String a="arzquwnjyn";
    char b='j';
        System.out.println(reversePrefix(a,b));
    }
    public static String reversePrefix(String word, char ch) {
        int index = 0;

        for(int i=0;i<word.length();i++){
            if (word.charAt(i)==ch){
                index=i;
                break;
            }
        }


        String neww="";
        for(int i=index;i>=0;i--){
            neww+=word.charAt(i);
        }


        for(int i=index+1;i<word.length();i++){
            neww+=word.charAt(i);
        }


        if (neww.length()>1){
            return neww;
        }

        return word ;
    }
}
