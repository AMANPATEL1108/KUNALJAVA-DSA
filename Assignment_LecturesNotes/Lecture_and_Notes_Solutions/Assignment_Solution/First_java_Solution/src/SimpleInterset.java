import java.util.Scanner;

public class SimpleInterset {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a P:");
        int a=sc.nextInt();
        System.out.println("Enter a T:");
        int b=sc.nextInt();
        System.out.println("Enter a R:");
        int c=sc.nextInt();
        System.out.println(Interset(a,b,c));
    }

    static  int Interset(int a,int b,int c){
        int total=a*b*c/100;
        return total;
    }

}
