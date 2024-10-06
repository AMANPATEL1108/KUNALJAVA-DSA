public class Main {
    public static void main(String[] args) {
//        int ans=fibo(10);
//        System.out.println(ans);
//       for(int i=0;i<11;i++){
//           System.out.println(fibFormula(i));
//       }

        System.out.println(fibFormula(50));
    }

    static int fibFormula(int n){
      return (int) (Math.pow (((1+ Math.sqrt(5))/2),n)/Math.sqrt(5));
    }

    static  int fibo(int n){
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}