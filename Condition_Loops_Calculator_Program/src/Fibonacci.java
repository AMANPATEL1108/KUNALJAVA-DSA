import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=0;
        int b=1;
        int temp=0;



//        for(int i=1;i<=n;i++){
//             a=b;
//             b=temp;
//             temp=a+b;
//        }


        int i=1;
        while ( i<=n){
            a=b;
             b=temp;
            temp=a+b;
            i++;
        }
        System.out.println(temp);
    }
}
