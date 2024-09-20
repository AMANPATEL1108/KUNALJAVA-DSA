import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empID=sc.nextInt();
        String department=sc.next();

        switch (empID){
            case 1:
                System.out.println("Aman Patel");
                break;
            case 2:
                System.out.println("Guru Patel");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "BCA":
                        System.out.println("BCA department");
                        break;
                    default:
                        System.out.println("Enter Correct Department");
                }
                break;
            default:
                System.out.println("Enter Correct empID");


        }
    }
}
