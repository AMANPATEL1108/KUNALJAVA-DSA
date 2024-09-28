import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String a=sc.nextLine();
        message(a);
    }

    static void message(String a){
        System.out.println("Hello my name is "+a+", Thank you for this.");
    }
}
