import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a First Number:");
        int n=sc.nextInt();

//        System.out.println("Enter a Second Number");
//        int p=sc.nextInt();

//        System.out.println( PrimeOrNot(n));
//        System.out.println(LeapYearOrNot(n));
//        MultiplixcationTable(n);

//        System.out.println(Hcf(n,p));
//        System.out.println(LCM(n,p));

        System.out.println(xInputSum(n));



    }

     static boolean PrimeOrNot(int n) {

        if (n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
            return true;
      }

      static boolean LeapYearOrNot(int n) {

          if (n % 400 == 0 || n % 100 != 0 && n % 4 == 0) {
              return true;

          } else {
              return false;
          }
      }

    static  int MultiplixcationTable(int n){

        for(int i=1;i<=10;i++){
            System.out.println(n +"*"+ i +" ="+ n * i);
        }
        return 0;

    }

    static int Hcf(int n,int p){

        while (p != 0) {
            int temp = p;
            p = n % p;
            n = temp;
        }
        return n;
    }

    static  int LCM(int n,int p){
        return (n * p) / Hcf(n, p);

    }

    static int xInputSum(int n){
            int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }



}
