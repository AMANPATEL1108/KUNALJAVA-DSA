public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }

        //binary Search
        while (start<end){
            //try for the middle potenyial answer
            int mid=start+(end-start)/2;

            //calculate pieces to divide this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if (sum+num>mid){
                    //can not add subarray make new one
                    //say add num add in sub array sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if (pieces>m){
                start=mid+1;
            }else {
                end=mid;
            }
        }
        return end;
    }
}
