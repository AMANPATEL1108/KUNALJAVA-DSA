public class ValidNumber {
    public static void main(String[] args) {
        String s="0";
        System.out.println(isNumber(s));
    }

    public static boolean isNumber(String s) {
        s.trim();
        if(s.isEmpty())
            return false;

        boolean seenNum=false;
        boolean seenE=false;
        boolean seenDot=false;   

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='.') {
                if(seenE || seenDot)
                    return false;
                seenDot=true;
            }
            else if(c=='+' || c=='-') {
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') {
                    return false;
                }
            }
            else if(c=='e' || c=='E') {
                if(seenE || !seenNum)
                    return false;
                seenE=true;
                seenNum=false;
            }
            else if(Character.isDigit(c)) {
                seenNum= true;
            }

            else {
                return false;
            }


        }


        return seenNum;
    }
}
