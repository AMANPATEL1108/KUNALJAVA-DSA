import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpecialBinaryString {
    public static void main(String[] args) {
    String a="11011000";
        System.out.println(makeLargestSpecial(a));
    }

    public static String makeLargestSpecial(String s) {
        if(s.length() == 0)
            return "";
        int height = 0;
        List<String> mountains = new ArrayList<>();
        int startIndex = 0;

        for(int i=0; i<s.length();i++){
            height += s.charAt(i) == '1'? 1 : -1;
            if(height == 0){
                mountains.add('1'+makeLargestSpecial(s.substring(startIndex+1,i))+'0');
                startIndex = i+1;
            }
        }

        Collections.sort(mountains, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for(String mountain : mountains){
            sb.append(mountain);
        }
        return sb.toString();
    }


}
