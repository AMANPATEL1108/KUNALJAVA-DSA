public class Missing_Number {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        int ans=missingNumber(arr);
        System.out.println(ans);


    }


     public static int missingNumber(int[] arr) {

        int i=0;
        while (i<arr.length){
            int correct=arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]){
                Swap(arr,i,correct);
            }else {
                i++;
            }
        }

        for(int index=0;index<arr.length;index++){
            if (arr[index] != index){
                return index;
            }
        }

        //case 2

        return arr.length;
    }

    static  void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
