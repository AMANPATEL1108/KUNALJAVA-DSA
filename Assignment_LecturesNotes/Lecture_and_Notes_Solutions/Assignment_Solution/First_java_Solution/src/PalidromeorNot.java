import java.util.Scanner;

public class PalidromeorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        System.out.println(check(str));
    }

    static boolean check(String str){

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}
