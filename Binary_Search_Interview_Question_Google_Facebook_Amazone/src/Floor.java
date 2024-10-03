public class Floor {
    public static void main(String[] args) {

        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=FloorofNumber(arr,target);
        System.out.println(ans);

    }
    static  int FloorofNumber(int[] arr,int target){
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        //find whether array sorted in asending or desending
        boolean isAsc=arr[start]<arr[end];

        while (start<=end){
//            int mid=(start+end)/2;
            int mid=start+(end-start)/2;


            if (arr[mid]==target){
                return mid;
            }

            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else{
                    start =mid+1;
                }
            }else{
                if (target>arr[mid]){
                    end=mid-1;
                }else {
                    start =mid+1;
                }
            }
        }
        return end;
    }
}
