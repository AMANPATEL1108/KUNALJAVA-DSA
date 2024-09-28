import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstromNumber {
    public static List<Integer> findArmstrongNumbers(int start, int end) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int sumOfDigitsPower = 0;
            int digitCount = String.valueOf(num).length();
            while (num > 0) {
                int digit = num % 10;
                sumOfDigitsPower += Math.pow(digit, digitCount);
                num /= 10;
            }
            if (sumOfDigitsPower == originalNum) {
                armstrongNumbers.add(originalNum);
            }
            num = originalNum;
        }
        return armstrongNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        List<Integer> armstrongNumbers = findArmstrongNumbers(start, end);
        System.out.println("Armstrong numbers between " + start + " and " + end + ": " + armstrongNumbers);
    }
}