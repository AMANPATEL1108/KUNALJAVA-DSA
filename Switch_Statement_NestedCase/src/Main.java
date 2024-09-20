import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        String Color=sc.next();
//
//        switch (Color){
//            case "Yellow":
//                System.out.println("THis is Yellow");
//                break;
//            case "red":
//                System.out.println("THis is Red");
//                break;
//            case "Blue":
//                System.out.println("THis is Blue");
//                break;
//            default:
//                System.out.println("Enter a Valid Color");
//        }

//        switch (Color) {
//            case "Yellow" -> System.out.println("THis is Yellow");
//            case "red" -> System.out.println("THis is Red");
//            case "Blue" -> System.out.println("THis is Blue");
//            default -> System.out.println("Enter a Valid Color");
//        }


        int day=sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("WednsDay");
//                break;
//            case 4:
//                System.out.println("ThurDay");
//                break;
//            case 5:
//                System.out.println("FriDay");
//                break;
//            case 6:
//                System.out.println("SaturDay");
//                break;
//            case 7:
//                System.out.println("SunDay");
//                break;
//            default:
//                System.out.println("Enter a Valid Day");
//                break;
//        }

//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("WednsDay");
//            case 4 -> System.out.println("ThurDay");
//            case 5 -> System.out.println("FriDay");
//            case 6 -> System.out.println("SaturDay");
//            case 7 -> System.out.println("SunDay");
//            default -> System.out.println("Enter a Valid Day");
//        }

        switch (day){
            case 1,2,3,4,5-> System.out.println("WorkDay");
            case 6,7-> System.out.println("Weekend");
        }
    }
}