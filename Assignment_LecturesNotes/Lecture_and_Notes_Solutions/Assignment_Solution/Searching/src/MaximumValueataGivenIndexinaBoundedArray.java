public class MaximumValueataGivenIndexinaBoundedArray {
    public static void main(String[] args) {
        int n=4;
        int index=2;
        int maxSum=6;

        System.out.println(maxValue(n,index,maxSum));

    }
    static int maxValue(int n, int index, int maxSum) {
        int res=1;
        maxSum -=n;
        int left=0,right=0;
        int maxLeft=index,maxRight=n-index-1;

        while (maxSum>0){
            res++;
            int leftVal=Math.min(left++,maxLeft);
            int rightVal=Math.min(right++,maxRight);
            maxSum-=(1+leftVal+rightVal);

            if (leftVal==maxLeft && rightVal==maxRight){
                break;
            }

        }
        if (maxSum>0){
            res=res+(maxSum/n);

        }
        return (maxSum<0)?res-1:res;
    }
}
