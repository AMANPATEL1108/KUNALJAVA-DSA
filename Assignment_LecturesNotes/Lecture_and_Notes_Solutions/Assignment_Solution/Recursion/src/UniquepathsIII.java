public class UniquepathsIII {
    public static void main(String[] args) {
        int[][] arr={{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        System.out.println(uniquePathsIII(arr));
    }

    public static int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int startRow = 0;
        int startCol = 0;
        int emptyCell = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }
                if (grid[i][j] == 0) emptyCell++;
            }
        }

        boolean[][] visited = new boolean[n][m];
        return helper(grid, startRow, startCol, emptyCell, visited);
    }

    private static int helper(int[][] grid, int i, int j, int emptyCell, boolean[][] visited) {
        if (grid[i][j] == 2) {
            if (emptyCell == -1) return 1;
            else return 0;
        }

        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        int count = 0;
        visited[i][j] = true;
        for (int ind = 0; ind < directions.length; ind++) {
            int d1 = directions[ind][0];
            int d2 = directions[ind][1];

            if (isValid(grid, i + d1, j + d2, visited)) count += helper(grid, i + d1, j + d2, emptyCell - 1, visited);
        }
        visited[i][j] = false;

        return count;
    }

    private static boolean isValid(int[][] grid, int i, int j, boolean[][] visited) {
        int n = grid.length;
        int m = grid[0].length;

        return i >= 0 && j >= 0 && i < n && j < m && grid[i][j] != -1 && !visited[i][j];
    }
}
