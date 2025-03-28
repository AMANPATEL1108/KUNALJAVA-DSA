import java.util.Stack;

public class ParsingABooleanExpression {
    public static void main(String[] args) {

        String s="&(|(f))";
        System.out.println(parseBoolExpr(s));

    }
    public static boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>(), sign = new Stack<>();

        for(char ch : expression.toCharArray()) {
            if(ch == ',') continue;
            if(ch == '(') {
                st.push('(');

            } else if (ch == ')') {
                char sign_top = sign.pop();

                boolean flag = (st.pop() == 't'), curr = false;
                while(st.peek() != '(') {
                    curr = st.pop() == 't';
                    if(sign_top == '&') flag = flag&curr;
                    else flag = flag|curr;
                }
                st.pop();

                if(sign_top == '!') flag = !flag;
                st.push(flag? 't' : 'f');

            } else if (ch == 'f' || ch == 't') {
                st.push(ch);

            } else {
                sign.push(ch);

            }
        }

        return st.peek()=='t';
    }

}
