public class MaximizeNumberofNiceDivisors {
    public static void main(String[] args) {
        int a=5;
        System.out.println(maxNiceDivisors(a));

    }

    private  static long mod = 1000000007;
    private static long pow(long n){
        if(n==0) return 1;
        long half=pow(n/2);
        if(n%2==0) return (half*half)%mod;
        return (3*half*half)%mod;
    }
    public static int maxNiceDivisors(int n) {
        if(n<5) return n;
        if(n%3==0) return (int)pow(n/3);
        if(n%3==1) return (int)((pow(n/3-1)*4)%mod);
        return (int)((pow(n/3)*2)%mod);
    }
}
