public class FindMountainArray {
    public static void main(String[] args) {


    }

    int search(int[] arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        //try to search second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);

    }


    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }


    static  int orderAgnosticBS(int[] arr,int target,int start,int end){

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
        return -1;
    }
}


