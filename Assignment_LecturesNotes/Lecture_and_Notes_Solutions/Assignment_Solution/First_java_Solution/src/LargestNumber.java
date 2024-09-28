import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number 1:");
        int a=sc.nextInt();
        System.out.println("Enter a Number 2:");
        int b=sc.nextInt();

        System.out.println(Check(a,b));    }

    static int Check(int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
