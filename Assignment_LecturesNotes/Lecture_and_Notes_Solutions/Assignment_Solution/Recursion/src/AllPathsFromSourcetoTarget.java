import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourcetoTarget {
    public static void main(String[] args) {
        int[][] a={{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(a));
    }

    private static void dfs(int s, List<Integer> c, int graph[][], int destination, List<List<Integer>> l){
        if(s == destination){
            l.add(new ArrayList(c));
            return;
        }
        for(int i : graph[s]){
            c.add(i);
            dfs(i,c,graph,destination,l);
            c.remove(c.size()-1);
        }
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length-1;
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        c.add(0);
        dfs(0,c,graph,n,l);
        return l;
    }


}
