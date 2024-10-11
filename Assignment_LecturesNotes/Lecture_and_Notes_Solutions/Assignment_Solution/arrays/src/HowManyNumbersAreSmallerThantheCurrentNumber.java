import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums={6,5,4,8};
        int[] ans=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {

        int arrlen=nums.length;
        int count=0;
        int[] ans=new int[arrlen];


        for(int i=0;i<arrlen;i++){
            count=0;
            for(int j=0;j<arrlen;j++){
                if (nums[i]>nums[j]){
                    count++;
                }
                ans[i]=count;
            }

        }
        return ans;

    }
}
