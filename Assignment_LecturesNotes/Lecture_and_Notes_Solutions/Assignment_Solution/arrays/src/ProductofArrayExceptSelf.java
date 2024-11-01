import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ans=productExceptSelf(nums);
        System.out.println(Arrays.toString(ans)     );
    }
    static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] prefixProductionStart=new int[n],prefixProductionEnd=new int[n],res=new int[n];

        prefixProductionStart[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixProductionStart[i]=prefixProductionStart[i-1]*nums[i];
        }

        prefixProductionEnd[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            prefixProductionEnd[i]= prefixProductionEnd[i + 1] * nums[i];
        }

        res[0]=prefixProductionEnd[1];
        res[n-1]=prefixProductionStart[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=prefixProductionStart[i-1]*prefixProductionEnd[i+1];
        }
        return res;

    }
}
