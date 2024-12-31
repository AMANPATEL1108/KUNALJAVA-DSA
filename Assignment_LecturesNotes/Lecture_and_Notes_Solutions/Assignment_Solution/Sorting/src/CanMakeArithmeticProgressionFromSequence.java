import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
    int[] arr={3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(d!=arr[i]-arr[i-1]){
                return  false;
            }
        }

        return true;
    }


}
