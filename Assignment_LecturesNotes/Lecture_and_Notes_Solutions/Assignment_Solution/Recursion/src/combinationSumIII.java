import java.util.ArrayList;
import java.util.List;

public class combinationSumIII {
    public static void main(String[] args) {
        int a=3;
        int b=7;

        System.out.println(combinationSum3(a,b));
    }

    static void rec(int n,int k,int i,int sum,List<Integer> ds,List<List<Integer>> ans)
    {
        if(ds.size()==k && sum==n)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(sum>n || i>=10) return;
        ds.add(i);
        sum+=i;
        rec(n,k,i+1,sum,ds,ans);
        ds.remove(ds.size()-1);
        sum-=i;
        rec(n,k,i+1,sum,ds,ans);
    }
    public static List<List<Integer>> combinationSum3(int k, int n)
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  ds = new ArrayList<>();
        int i=1;
        int sum=0;
        rec(n,k,i,sum,ds,ans);
        return ans;
    }


}
