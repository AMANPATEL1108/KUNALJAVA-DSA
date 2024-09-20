import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //find the Largest Number of that

//        if (a < b && c<b) {
//            System.out.println(b);
//        } else if (a<c && b<c) {
//            System.out.println(c);
//        } else {
//            System.out.println(a);
//        }

//        System.out.println(Math.max(25,50));

        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
