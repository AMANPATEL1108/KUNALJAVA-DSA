import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().trim().charAt(0);

//        String word="aman";

        if (ch >= 'a' && ch<='z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }

//        System.out.println(ch);
//        System.out.println(sc.next().trim());
    }
}
