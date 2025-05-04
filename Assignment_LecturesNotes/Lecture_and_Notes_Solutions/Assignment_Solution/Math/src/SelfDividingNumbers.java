import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
    int l=1;
    int r=22;
        System.out.println(selfDividingNumbers(l,r));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int number = left; number <= right; number++){
            if(isSelfDevide(number)) list.add(number);
        }
        return list;
    }
    private static boolean isSelfDevide(int num){
        int ogNum = num;

        while(num > 0){
            int digit = num % 10;
            num /= 10;

            if(digit == 0 || ogNum % digit != 0)    return false;
        }
        return true;
    }
}
