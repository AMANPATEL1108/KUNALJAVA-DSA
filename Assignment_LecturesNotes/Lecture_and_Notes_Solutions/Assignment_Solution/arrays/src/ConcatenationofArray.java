import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int[] ans=getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums) {
        int numssize=nums.length;   //-a1  add
        int[] newarr=new int[numssize*2];
        for(int i=0;i<numssize;i++){
            newarr[i]=nums[i];
        }
        for(int i=0;i<numssize;i++){
            newarr[i+numssize]=nums[i];
        }
        System.out.println(newarr);
    return newarr;
    }

}
