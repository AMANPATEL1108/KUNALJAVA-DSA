public class RecursionNumberExample {
    public static void main(String[] args) {
        print(1);
    }
    static  void  print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //evey function take memory separately
        print(n+1);
    }
}
