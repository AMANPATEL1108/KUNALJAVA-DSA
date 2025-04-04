public class RomantoInteger {
    public static void main(String[] args) {
        String a = "MCMXCIV";
        System.out.println(romanToInt(a));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            int next = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;

            if (current < next) {
                sum += next - current;
                i++;
            } else {
                sum += current;
            }
        }
        return sum;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: return 0;
        }
    }
}