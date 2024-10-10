public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int ans=numIdenticalPairs(nums);
        System.out.println(ans);

    }
    static int numIdenticalPairs(int[] nums) {
        int res=0;
        int[] CountArray=new int[101];
        for(int num:nums){
            CountArray[num]++;
        }
        for(int Count:CountArray){
            Count=(Count*(Count-1))/2;
            res+=Count;
        }
        return res;
    }
}
