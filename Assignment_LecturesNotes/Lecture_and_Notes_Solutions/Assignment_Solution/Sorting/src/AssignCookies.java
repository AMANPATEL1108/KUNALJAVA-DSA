import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
int[] g={1,2,3};
int[] s={1,1};

        System.out.println(findContentChildren(g,s));
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0, contentChildren = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                contentChildren++;
                i++;
            }
            j++;

        }

        return contentChildren;
    }
}
