import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=1;i< nums.length;i++){
            if (nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}
