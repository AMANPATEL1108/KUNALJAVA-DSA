import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String a="([])";
        System.out.println(isValid(a));
    }

    public static boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                a.push(s.charAt(i));
            } else {
                if (a.isEmpty()) {
                    return false;
                }
                if ((a.peek() == '(' && s.charAt(i) == ')') ||
                        (a.peek() == '[' && s.charAt(i) == ']') ||
                        (a.peek() == '{' && s.charAt(i) == '}')) {
                    a.pop();
                } else {
                    return false;
                }
            }
        }
        return a.isEmpty();
    }
}
