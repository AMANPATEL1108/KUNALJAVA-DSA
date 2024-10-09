import java.util.Arrays;

public class RunningSumog1DArrays {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ans=runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums) {
        int sizeofnums=nums.length;
        int sum=0;
        int[] newarr=new int[sizeofnums];
        for(int i=0;i<sizeofnums;i++){

//            System.out.println(Arrays.toString(nums));
           if (i!=0){
               newarr[i]=newarr[i-1]+nums[i];
           }else {
               newarr[i]=nums[i];
           }

        }
        return newarr;
    }

}
