public class OrderBinarySearch {
    public static void main(String[] args) {
//        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr={56,52,32,25,15,-25,-89,-98};
        int target=-98;

        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);


    }
    static  int orderAgnosticBS(int[] arr,int target){
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
        return -1;
    }
}
