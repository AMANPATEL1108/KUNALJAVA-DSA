public class SplitTwoStringstoMakePalindrome {
    public static void main(String[] args) {
        String a="x";
        String b="y";
        System.out.println(checkPalindromeFormation(a,b));
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        return solve(a,b) || solve(b,a);
    }

    private static boolean solve(String a, String b){
        int i = 0;
        int j = b.length()-1;

        while(a.charAt(i) == b.charAt(j)){
            i++;
            j--;
        }

        String ABB = a.substring(0,i) + b.substring(i);
        String AAB = a.substring(0,a.length()-i) + b.substring(b.length()-i);

        return isPalindrome(ABB) || isPalindrome(AAB);
    }

    private static boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
