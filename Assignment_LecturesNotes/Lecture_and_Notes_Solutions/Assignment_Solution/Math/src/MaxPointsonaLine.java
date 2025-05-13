import java.util.HashMap;

public class MaxPointsonaLine {
    public static void main(String[] args) {
    int[][] a={{1,1},{2,2},{3,3}};
        System.out.println(maxPoints(a));
    }

    public static int maxPoints(int[][] points) {
        int max=0;
        for(int i=0; i<points.length; i++)
        {
            HashMap<Double, Integer> map= new HashMap<>();
            for(int j=0; j<points.length; j++)
            {
                double slope=0;
                if(points[i][0]==points[j][0] && points[i][1]==points[j][1])
                {
                    continue;
                }

                if(points[i][0]==points[j][0])
                {
                    slope=Double.POSITIVE_INFINITY;
                }
                else
                {
                    slope= (double)(points[j][1]-points[i][1])/(points[j][0]-points[i][0]);
                }
                map.put(slope,map.getOrDefault(slope,0)+1);
                max=Math.max(max,map.get(slope));
            }
        }
        return max+1;
    }
}
