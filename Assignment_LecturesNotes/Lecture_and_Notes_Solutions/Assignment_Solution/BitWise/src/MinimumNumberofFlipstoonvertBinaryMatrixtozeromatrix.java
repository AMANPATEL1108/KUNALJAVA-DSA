import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimumNumberofFlipstoonvertBinaryMatrixtozeromatrix {
    public static void main(String[] args) {
        int[][] a={{0,0},{0,1}};
        System.out.println(minFlips(a));
    }


    public static int minFlips(int[][] mat) {
        String curr = matToString(mat);
        String zeros = zeroMetrix(mat.length, mat[0].length);
        if (curr.equals(zeros)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(curr);
        Set<String> set = new HashSet<>();
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String temp = queue.poll();
                if (temp.equals(zeros)) {
                    return step;
                }
                for (int j = 0; j < temp.length(); j++) {
                    String nei = flip(temp, j, mat.length, mat[0].length);
                    if (set.contains(nei)) {
                        continue;
                    }
                    queue.offer(nei);
                    set.add(nei);
                }
            }
            step += 1;
        }
        return -1;
    }

    private static String zeroMetrix(int n, int m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n * m; i++) {
            sb.append(0);
        }
        return sb.toString();
    }

    private static String matToString(int[][] mat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sb.append(mat[i][j]);
            }
        }
        return sb.toString();
    }

    private static String flip(String str, int idx, int n, int m) {
        int x = idx / m;
        int y = idx % m;
        char[] cs = str.toCharArray();
        int[] dx = new int[]{0, 0, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0};
        if (cs[idx] == '0') {
            cs[idx] = '1';
        } else {
            cs[idx] = '0';
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                continue;
            }
            int v = nx * m + ny;
            if (cs[v] == '1') {
                cs[v] = '0';
            } else {
                cs[v] = '1';
            }
        }
        return new String(cs);
    }

}
