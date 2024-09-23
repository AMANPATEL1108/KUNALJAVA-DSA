import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//       int ans= sum2();
//        System.out.println(ans);
        int ans=sum3(5,7);
        System.out.println(ans);

    }

    //passing parameter of number when you are calling the methods
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }

    //return the value
//    static int sum2(){
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter First Number:");
//        int num1=sc.nextInt();
//
//        System.out.println("Enter Second Number:");
//        int num2=sc.nextInt();
//
//        int sum=num1+num2;
//
//        return sum;
//
//        //Error showing after returen : System.out.println("THis is not Execute");
//    }

//     static void sum(){
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter First Number:");
//        int num1=sc.nextInt();
//
//        System.out.println("Enter Second Number:");
//        int num2=sc.nextInt();
//
//        int sum=num1+num2;
//        System.out.println("Sum="+sum);
//    }



    /*
    access Modifier(oop) returntype name(argument){
    //body
    return statement
    }

     */

}
