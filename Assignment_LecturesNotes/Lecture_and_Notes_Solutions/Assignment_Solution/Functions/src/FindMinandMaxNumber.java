import java.util.Scanner;

public class FindMinandMaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a A NUmber:");
        int a=sc.nextInt();
//        System.out.println("Enter a B NUmber:");
//        int b=sc.nextInt();
//        System.out.println("Enter a C NUmber:");
//        int c=sc.nextInt();
//        int[] ans=maxMin(a,b,c);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(EvenOrOdd(a));
//        System.out.println(Vote(a));
//        System.out.println(Sum(a,b));

//        System.out.println(ProductNumber(a,b));
//        double[] ans=circumference(a);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(prime(a));
//        System.out.println(Grade(a));
//        System.out.println(Factotial(a));
//        System.out.println(Palidrome(a));
//        System.out.println(Paythgorean(a,b,c));
//        System.out.println(RangePrimeNumebr(a,b));
        System.out.println(SumofNNaturalNumebr(a));
    }
    static  int[] maxMin(int a,int b,int c){
       int max=a;
        if (b>a){
            max=b;
        }
        if (c>b){
            max=c;
        }

        int min=a;
        if (a>b){
            min=b;
        }
        if (b>c){
            min=c;
        }
        return new int[]{max, min};
    }

    static String EvenOrOdd(int a){
        if (a%2==0){
            return "even";
        }else {
            return "odd";
        }
    }

    static  String Vote(int a){
        if (a>=18){
            return "Eligable";
        }else {
            return "Not Eligable";
        }

    }

    static  int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }


    static int ProductNumber(int a,int b){
        int result=0;
        result=a*b;
        return result;
    }

    static double[] circumference(int a){
        double cir=2*3.14*a;
        double area=3.14*a*a;
        return new double[]{cir,area};

    }

    static boolean prime(int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String Grade(int a){
     if (a>=91 && 100>=a){
         return "AA";
     }
     if (a>=81 && 90>=a){
            return "AB";
     }
     if (a>=71 && 80>=a){
            return "BB";
     } if (a>=61 && 70>=a){
            return "BC";
     } if (a>=51 && 60>=a){
            return "CD";
     } if (a>=41 && 50>=a){
            return "DD";
     } if (40>=a){
            return "Fail";
     }
     else {
         return "Enter Correct Number";
     }
    }

    static  int Factotial(int a){
        int sum=1;
        if (a==1 || a==0){
            return 1;
        } else
            for(int i=1;i<=a;i++){
                sum=i*sum;
            }
            return sum;
    }


    static boolean Palidrome(int a){
        int temp=a;
        int sum=0,r;
        while (a>0){
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        if (temp==sum){
            return true;
        }else {
            return false;
        }
    }

    static boolean Paythgorean(int a,int b,int c){
        int formula=(a*a)+(b*b);
         c=c*c;
        if (c==formula){
            return true;
        }else {
            return false;
        }
    }

    static boolean RangePrimeNumebr(int a, int b){
        for(int i=a;i<=b;i++){
            if (prime(i)){
                System.out.println(i+" ");
            }
        }
        return false;
    }


    static int SumofNNaturalNumebr(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        return sum;
    }
}

