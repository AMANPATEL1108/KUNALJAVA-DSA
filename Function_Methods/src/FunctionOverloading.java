import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
//        fun(67);
//        System.out.println("Aman Patel");
//        int ans=sum(3,4);
//        System.out.println(ans);
//        int ans2=sum(3,4,5);
//        System.out.println(ans2);
        demo(3,4,5,6);
        demo("Aman","Patel");

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }

    static int sum(int a,int b){
        return a+b;

    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
