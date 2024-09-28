import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a=sc.nextInt();
        EvenorOdd(a);
    }

    static void EvenorOdd(int a){
        if (a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        return;
    }
}