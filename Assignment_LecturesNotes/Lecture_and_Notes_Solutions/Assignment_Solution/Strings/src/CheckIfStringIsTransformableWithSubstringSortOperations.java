public class CheckIfStringIsTransformableWithSubstringSortOperations {
    public static void main(String[] args) {
    String a="84532";
    String b="34852";
        System.out.println(isTransformable(a,b));
    }

    public static boolean isTransformable(String s, String t) {
        int[][] sr = new int[10][10];
        int[][] tr = new int[10][10];
        int[] sc = new int[10];
        int[] tc = new int[10];
        boolean equal = true;
        for (int i = 0; i < s.length(); i++)
        {
            int ss = s.charAt(i) - '0';
            int tt = t.charAt(i) - '0';
            if (equal)
            {
                switch (Integer.compare(tt,ss))
                {
                    case 1: return false;
                    case -1: equal = false;
                }
            }
            sc[ss]++;
            tc[tt]++;
            for (int j = 9; j > ss; j--)
                sr[ss][j] += sc[j];

            for (int j = 9; j > tt; j--)
                tr[tt][j] += tc[j];
        }


        for (int i = 0; i < 9; i++)
        {
            if (sc[i] != tc[i])
                return false;

            for (int j = i+1; j <= 9; j++)
            {
                if (tr[i][j] > sr[i][j])
                    return false;
            }
        }
        return true;
    }
}
