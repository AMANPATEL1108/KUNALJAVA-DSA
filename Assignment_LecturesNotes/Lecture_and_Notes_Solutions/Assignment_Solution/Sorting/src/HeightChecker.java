import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr={1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }
    static int heightChecker(int[] heights) {
        int ans=0;
       int[] newarr= heights.clone();
        Arrays.sort(newarr);

        for(int i=0;i<heights.length;i++){
            if (heights[i]!=newarr[i]){
                ans+=1;
            }
        }
        return  ans;
    }
}
