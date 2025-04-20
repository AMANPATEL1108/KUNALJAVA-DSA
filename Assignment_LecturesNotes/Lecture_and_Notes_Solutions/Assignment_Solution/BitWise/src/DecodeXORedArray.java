import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {

        int[] a={1,2,3};
        int b=1;
        System.out.println(Arrays.toString(decode(a,b)));
    }

    public static int[] decode(int[] encoded, int first) {
        int res[]=new int[encoded.length+1];
        res[0]=first;
        for(int i=0; i<encoded.length; i++){
            res[i+1] = res[i]^encoded[i];
        }
        return res;
    }
}
