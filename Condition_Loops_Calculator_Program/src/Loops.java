import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter a Number");
        int a=sc.nextInt();
        //loops

        //for Loops
//            for(int i=1;i<=a;i++){
//                System.out.println(i);
//                System.out.println("Hello World");
//            }

    //while Loops
//        int num=1;
//        while(num<=5){
//            System.out.println(num);
//            num++;
//        }

        //do while Loops

        int n=1;
        do{
            System.out.println(n);
            n++;
        }while (n<=5);

    }
}
