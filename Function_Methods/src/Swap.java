import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

//        swap(a,b);
//        System.out.println(a+" "+b);


//        String name="Aman Patel";
//        String newName=changeName(name);
//        System.out.println(newName);

    }

//     static String changeName(String name) {
//        name="I am Aman";
//        return name;
//    }

    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;

        //this Change will be valid this Function Scope Only

    }
}
