public class Celling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans=CellingofNumber(arr,target);
        System.out.println(ans);
    }

    static  int CellingofNumber(int[] arr,int target){
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
        return start;
    }
}
