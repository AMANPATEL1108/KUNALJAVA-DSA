//public class FindinMountainArray {
//    public static void main(String[] args) {
//    int[] MountainArr={1,2,3,4,5,3,1};
//    int target=3;
//    findInMountainArray(target,MountainArr);
//    }
//    static int findInMountainArray(int target, MountainArray mountainArr) {
//        int n=mountainArr.length();
//        int low=1;
//        int high=n-2;
//        while(low!=high){
//            int mid=low+(high-low)/2;
//            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
//                low=mid+1;
//            }else{
//                high=mid;
//            }
//        }
//        int peak=low;
//        low=0;
//        high=peak;
//
//        while(low!=high){
//            int mid=low+(high-low)/2;
//            int curr=mountainArr.get(mid);
//            if(curr==target){
//                return mid;
//            }
//            if(curr<target){
//                low=mid+1;
//            }else{
//                high=mid;
//            }
//        }
//
//        if(mountainArr.get(low)==target) return low;
//
//        low=peak+1;
//        high=n-1;
//
//        while(low!=high){
//            int mid=low+(high-low)/2;
//            int curr=mountainArr.get(mid);
//            if(curr==target){
//                return mid;
//            }
//            if(curr>target){
//                low=mid+1;
//            }else{
//                high=mid;
//            }
//
//        }
//        if(mountainArr.get(low)==target) return low;
//        return -1;
//    }
//}
