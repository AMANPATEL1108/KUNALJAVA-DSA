public class Comparision {
    public static void main(String[] args) {
        String a="Aman";
        String b="Aman";

        System.out.println(a==b);  //true

        String a1=new String("Aman");

        String b1=new String("Aman");
        System.out.println(a1==b1); //false

        System.out.println(a1.equals(b1));  //true

        System.out.println(a1.charAt(0)); //A


    }
}
