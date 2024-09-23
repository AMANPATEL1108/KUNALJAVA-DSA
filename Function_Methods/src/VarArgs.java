import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,6,3,6,3,6);
    mutiple(2,3,"aman","Patel");
    }

    static void mutiple(int a,int b,String ...v){

    }


    static  void fun(int ...v){ //v as what we want
        System.out.println(Arrays.toString(v));
    }
}
