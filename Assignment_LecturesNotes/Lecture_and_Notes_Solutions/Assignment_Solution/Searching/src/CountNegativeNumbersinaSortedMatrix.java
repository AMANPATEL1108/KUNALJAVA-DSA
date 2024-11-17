public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {

        int[][] arr={{5,1,0},{-5,-5,-5}};
        System.out.println(countNegatives(arr));
    }

    static int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<=grid[i].length;j++){
                if(grid[i][j]<0){
                    count+=(grid[i].length-j);
                    break;
                }
            }
        }
        return count;
    }
}
