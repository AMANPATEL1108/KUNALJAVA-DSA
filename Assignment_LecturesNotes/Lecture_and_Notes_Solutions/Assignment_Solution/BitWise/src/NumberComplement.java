public class NumberComplement {
    public static void main(String[] args) {
        int a=5;
        System.out.println(findComplement(a));
    }

    public static int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '0'){
                res += '1';
            }
            else{
                res += '0';
            }
        }
        return Integer.parseInt(res,2);
    }
}
