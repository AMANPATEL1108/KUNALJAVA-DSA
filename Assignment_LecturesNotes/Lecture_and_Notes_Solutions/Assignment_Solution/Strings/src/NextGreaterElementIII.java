public class NextGreaterElementIII {
    public static void main(String[] args) {
        int a=12;
        System.out.println(nextGreaterElement(a));
    }
    public static int nextGreaterElement(int n) {
        String str = Integer.toString(n);
        char ch[] = str.toCharArray();
        int len = ch.length;
        int i = len - 2;
        while (i >= 0 && ch[i] >= ch[i + 1]) {
            i--;
        }
        if (i == -1) {
            return -1;
        } else {
            int k = len - 1;
            while (ch[i] >= ch[k]) {
                k--;
            }

            char temp = ch[i];
            ch[i] = ch[k];
            ch[k] = temp;
        }
        String sb = "";
        for (int m = 0; m <= i; m++) {
            sb = sb + ch[m];
        }
        for (int notu = ch.length - 1; notu > i; notu--) {
            sb = sb + ch[notu];
        }

        long number = Long.parseLong(sb.toString());
        return (number <= Integer.MAX_VALUE) ? (int) number : -1;
    }
}
