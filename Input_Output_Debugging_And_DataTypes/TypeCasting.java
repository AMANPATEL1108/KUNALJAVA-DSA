import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        float num=sc.nextFloat();
//        System.out.println(num);


        //type Casting
//        int num=(int)(67.56f);
//        System.out.println(num);
//        automatic type promotion expression
//        int a=257;
//        byte b=(byte)(a);  // 257 % 256 = 1
//        System.out.println(b);


//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=a*b/c;
//        System.out.println(d);


//        byte b=50;
//        b=b * 2;

//        int num='A';
//        System.out.println(num);
//
//        System.out.println("नमस्ते");

//        System.out.println(3*6);

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i / c)-(d-s);
        //float + int - double = double
        System.out.println((f*b)+" "+(i / c)+" "+(d-s));
        System.out.println("My result is :"+result);

    }
}
