public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=14;
        System.out.println(InRange(arr,target));


    }

    static int InRange(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for(int i=1;i<=4;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
