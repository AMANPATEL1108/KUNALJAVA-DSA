import java.util.Scanner;

public class Armstrom {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Value");
//        int n=sc.nextInt();

        for(int i=100;i<1000;i++){
            if (isArmStrong(i)){
                System.out.println(i+" ");
            }
        }

//        System.out.println(isArmStrong());
    }
    static boolean isArmStrong(int n) {
        int original=n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum+rem*rem*rem;
        }
        return sum==original;
    }
}
