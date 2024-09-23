import java.util.Scanner;

public class Main {
    public static void main(StringExample[] args) {

        //Q-Take input of Two nUmber Print Sum


        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        num1=sc.nextInt();

        System.out.println("Enter Second Number:");
        num2=sc.nextInt();

        sum=num1+num2;
        System.out.println("Sum="+sum);
    }
}