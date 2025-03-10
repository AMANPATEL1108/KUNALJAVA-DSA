public class K_thSymbolinGrammar
{
    public static void main(String[] args) {
        int a=1;
        int b=1;
        System.out.println(kthGrammar(a,b));
    }

    public static int kthGrammar(int n, int k) {
        if (n == 1) return 0;

        int mid = 1 << (n-2);

        if (k <= mid) {

            return kthGrammar(n-1, k);

        } else {

            return 1 - kthGrammar(n-1, k-mid);

        }
    }
}
