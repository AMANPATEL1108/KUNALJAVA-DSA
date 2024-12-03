public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] arr={3,2,2,4,1,4};
        int days=3;
        System.out.println(shipWithinDays(arr,days));
    }
    static boolean cal(int []weights,int days,int mid)
    {
        int sum=0;
        int day=1;
        for(int i=0;i<weights.length;i++)
        {
            if(sum+weights[i]>mid)
            {
                day+=1;
                sum=weights[i];
            }
            else
            {
                sum+=weights[i];
            }
        }
        return day<=days;
    }
    static int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++)
        {
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(cal(weights,days,mid)==true)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }
        return  low;
    }
}
