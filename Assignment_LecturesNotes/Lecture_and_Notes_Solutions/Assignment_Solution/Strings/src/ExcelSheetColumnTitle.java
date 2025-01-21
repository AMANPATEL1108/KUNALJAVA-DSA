public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
    int num=28;
        System.out.println(convertToTitle(num));
    }
    public static String convertToTitle(int columnNumber) {
        int n = columnNumber;
        StringBuilder sb =new StringBuilder();
        while(n!=0){
            n = n-1;
            int rem = n%26;
            sb.append(Character.toString(65+rem));
            n = n/26;
        }
        return sb.reverse().toString();
    }
}
