public class CountGoodNumbers {
    public static void main(String[] args) {
        int a=1;
        System.out.println(countGoodNumbers(a));
    }

    static int mod=(int)1e9+7;
    public static int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long a=pow(4,odd)%mod;
        long b=pow(5,even)%mod;
        return (int)((a*b)%mod);
    }

    public static long pow(long a,long b){
        if(b==0){
            return 1;
        }
        long temp=pow(a,b/2);
        if(b%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (a *temp*temp)%mod;
        }
    }
}
