import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list=new ArrayList<>(5);
//        list.add(67);
//        list.add(46);
//        list.add(64);
//        list.add(55);
//        list.add(63);
//        list.add(423);


//        System.out.println(list.contains(64));
//
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));  //pass index here  list of index here is not working
        }
//        System.out.println(list);  //directly print
    }
}
