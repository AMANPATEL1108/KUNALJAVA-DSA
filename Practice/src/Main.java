public class Main {
    public static void main(String[] args) {
        int[] arr={11,12,13,14,15,16,17};
        int target=12;
        int ans=SmallestLetterAfterTarget(arr,target);
        System.out.println(ans);


    }
    static  int BinarySearch(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while (start<=end){
//            int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            }else if(target> arr[mid]) {
                start =mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    static  int SmallestLetterAfterTarget(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while (start<=end){
//            int mid=(start+end)/2;
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            }else if(target> arr[mid]) {
                start =mid+1;
            }else{  mid= mid+1;
                return mid;
            }
        }
        return -1;

    }
}