public class Shadowing {

    static int x=90;//this will be Shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x;
//      System.out.println(x); //scope will beging when value is initialized
        x=40;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
