public class FirstandLastPosition {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
      int[] ans= searchRange(arr,12);
        System.out.println(ans);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        int start=search(nums,target,true);

        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    }

//    this function just return index value to search of target
     static  int search(int[] nums, int target, boolean findstartIndex){

            int ans=-1;
            int start=0;
            int end=nums.length-1;

            while (start<=end){
                int mid=start+(end-start)/2;

                if (target<nums[mid]){
                    end=mid-1;
                }else if(target> nums[mid]) {
                    start =mid+1;
                }else{
                    //potential answer found
                   ans=mid;
                   if (findstartIndex){
                       end=mid-1;
                   }else {
                       start=mid+1;
                   }
                }
            }
            return ans;
        }
}
