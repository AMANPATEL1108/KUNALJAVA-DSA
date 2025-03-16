import java.util.ArrayList;
import java.util.List;

public class findthewinnerofthecirculargame {
    public static void main(String[] args) {
            int a=6;
            int b=5;
        System.out.println(findTheWinner(a,b));
    }
    public static int findTheWinner(int n, int k) {
        List<Integer> list=new ArrayList<>();

        for (int i=0;i<n;i++) {
            list.add(i+1);
        }
        rec(list,k,0);
        return list.get(0);
    }

    private static void rec(List<Integer> list, int k, int index) {
        if (list.size() == 1 ) return;
        index=(index+k-1)%list.size();
        list.remove(index);
        rec(list,k,index);
    }

}
