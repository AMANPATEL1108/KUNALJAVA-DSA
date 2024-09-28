import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a A:");
        int a=sc.nextInt();
        System.out.println("Enter a B:");
        int b=sc.nextInt();

        Operationof(a,b);
    }

    static void Operationof(int a,int b){
        System.out.println("Addition="+" "+(a+b));
        System.out.println("Substraction="+" "+(a-b));
        System.out.println("Multiplication="+" "+(a*b));
        System.out.println("Division="+" "+(a/b));


    }
}
