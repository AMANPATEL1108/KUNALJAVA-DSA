public class HammingDistance {
    public static void main(String[] args) {
    int x = 1, y = 4;
        System.out.println(hammingDistance(x,y));
    }

    public static int hammingDistance(int x, int y) {
        int res=x^y;
        int count=0;
        while(res!=0)
        {
            int rsb=res&-res;
            res-=rsb;
            count++;
        }
        return count;

    }


}
