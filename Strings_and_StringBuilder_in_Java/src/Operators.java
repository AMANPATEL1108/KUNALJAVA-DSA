import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
//        System.out.println('a'+'b');
//        System.out.println("a"+"b");
//        System.out.println((char)('a'+3));

        //this is same as afte a few steps:"a"+1;
//        System.out.println("a"+1);//integer will be converted to Integer that will call toString();

//        System.out.println("Aman"+new ArrayList<>());
//        System.out.println("Aman"+new Integer(56));


//        System.out.println(new Integer(56)+new ArrayList<>()); //Error
        String ans=new Integer(56)+" "+new ArrayList<>();  //working
        System.out.println(ans);
    }
}
