import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Temperature in C:");
        float tempc=sc.nextFloat();

        float tempF=(tempc*9/5)+32;
        System.out.println(tempF);
    }
}
