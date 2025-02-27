import java.util.Arrays;

public class OrderlyQueue {
    public static void main(String[] args) {
    String a="cba";
    int b=1;
        System.out.println(orderlyQueue(a,b));
    }
    public static String orderlyQueue(String s, int k) {
        if(k > 1) {
            final char[] arr = s.toCharArray();

            Arrays.sort(arr);

            return new String(arr);
        }

        String result = s;

        for(int i = 0; i < s.length(); ++i) {
            final String tmp = s.substring(i) + s.substring(0, i);

            if(result.compareTo(tmp) > 0)
                result = tmp;
        }

        return result;
    }


}
