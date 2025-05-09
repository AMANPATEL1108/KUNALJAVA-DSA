public class ThekthsupFactorofn {
    public static void main(String[] args) {
    int a=12;
    int b=3;
        System.out.println(kthFactor(a,b));
    }

    public static int kthFactor(int n, int k) {
        for(int i=1;i<=(n/2);i++){
            if(n%i == 0){
                k--;
                if(k==0){
                    return i;
                }
            }
        }
        if(k==1){
            return n;
        }
        return -1;
    }
}
