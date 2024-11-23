public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        int[] arr={3,5,0};
        System.out.println(specialArray(arr));
    }
    static int specialArray(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]>=2){
                count=count+1;
            }
        }
        return count>0 ? count:-1;
    }
}
