public class Scope {
    public static void main(String[] args) {
    int a=10;
    int b=20;
    String name="Kunal";
        {
//           int a=78;//alredy initilized
            a=100;  //update Value
            int c=99;
            name="Aman";
            System.out.println(name);
            //value initalize in this block,will remian in block

        }
        System.out.println(name);
//        System.out.println(c);//can not use outside


        //scoping in for loop
        for(int i=0;i<4;i++){
            System.out.println(i);
            int num=90;
             a=10000;
        }
//        System.out.println(i);

    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
    }
}
