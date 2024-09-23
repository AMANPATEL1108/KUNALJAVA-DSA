import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name:");
        String nameofinput=sc.nextLine();

//        String message=greet();
//        System.out.println(message);
        String personnalizedmessage=myGreet(nameofinput);
        System.out.println(personnalizedmessage);
    }

     static String myGreet( String name) {
        String message="Hello "+name;
        return  message;
    }

    static String greet(){

        String greeting="How are you??";

        return greeting;
    }
}
