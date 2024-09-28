import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a N Number:");
        int n=sc.nextInt();
        System.out.println(Fibbonacci(n));
    }

    static  int Fibbonacci(int n){
        int sum=0;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            a=b;
            b=sum;
            sum=a+b;


        }
        return sum;
    }
}
