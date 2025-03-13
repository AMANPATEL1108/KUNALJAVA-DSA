public class MinimumNon_ZeroProductoftheArrayElements {
    public static void main(String[] args) {
    int a=1;
        System.out.println(minNonZeroProduct(a));
    }
    public static int minNonZeroProduct(int p) {

        long N = (long)Math.pow(10,9)+7;
        long max = (long)Math.pow(2,p)-1;
        long pow = (long)power(max-1,(max-1)/2);
        pow = ((pow%N*(max%N))%N);
        return (int)pow;
    }
    static long power(long num, long p)
    {
        if(p==0)
            return 1l;
        long N = (long)Math.pow(10,9)+7;
        long temp = power(num,p/2);
        temp = temp%N;
        if(p==0)
            return (temp*temp)%N;
        else
            return ((temp*temp)%N * (num%N))%N;
    }

}
