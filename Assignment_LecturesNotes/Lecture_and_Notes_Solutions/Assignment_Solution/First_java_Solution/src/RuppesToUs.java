import java.util.Scanner;

public class RuppesToUs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Rupeess:");
        int a=sc.nextInt();
        System.out.println(ConvertUs(a));    }
    static  float  ConvertUs(int a){
        float us=a/83.72f;
        return us;
    }
}
