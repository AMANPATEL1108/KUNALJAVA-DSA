import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int m=3;
        int[] num2={2,5,6};
        int n=3;
int[] ans=merge(num1,m,num2,n);
        System.out.println(Arrays.toString(ans));

    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0)
        {
            if(i>=0 && nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        return nums1;
    }
}
