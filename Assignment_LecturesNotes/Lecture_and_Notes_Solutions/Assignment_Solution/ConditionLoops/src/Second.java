import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] array = new int[n];
//        for(int i=0;i<n;i++){
//            array[i]=sc.nextInt();
//        }
//        System.out.println(Factorial(5));
//        System.out.println(ElecctricityBill(1,2,3,40));
//        System.out.println(AverageOfNNUmber(array,n));
//        System.out.println(dicountOfProduct(15,2500));
//        System.out.println(distance(3,4,4,3));
//        System.out.println(Commissionint(2000,15));
//        System.out.println(Power(156,25));
//        System.out.println(DepreciationofValue(15,25,30));
//        System.out.println(BattingAvg(15,2));
//        System.out.println(CGPA(15,3));
//        System.out.println(CompondInterest(5,4,6));
//        System.out.println(Averagemarks(array,n));

//        System.out.println(SumofNNumbers(5) );
//        System.out.println(ArmstromNumber(371));
//        System.out.println(Ncr(6,6));
//        System.out.println(Npr(6,25));
//        System.out.println(Reverse("aman"));
//        System.out.println(PalidromeorNot("amaa"));
//        System.out.println(Fv(5,25));
//        System.out.println( hcf(40, 10));
//        System.out.println(LCM(10,5));
//        System.out.println(VowelorConstent('b'));
//        System.out.println(PerfectNumber(7));
//        System.out.println(LeapYear(2000));
//        System.out.println(SUmofDigits(687));
//        System.out.println(GotoOut(31));
        SumofNegativeNumberPositivePositiveodd();

    }

    static int Factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }

    static  int ElecctricityBill(int k,int w,int h,int r){
        int bill=(k*w*h)*r;
        return bill;
    }

    static  int AverageOfNNUmber(int[] array,int n){
        int total=0;
        for(int i=0;i< array.length;i++){
             total=total+array[i];
        }
        return total/n;
    }

    static  float dicountOfProduct(int d,int price){
        float dicount=(d/price)*100;
        return dicount;
    }

    static  double distance(int x1,int x2,int y1,int y2){
        double dis= (int) Math.sqrt(Math.pow((x2 - x1), 2)  + Math.pow((y2 - y1), 2));

        return dis;
    }

    static  int Commissionint(int toalsales,int commisionrate){
        return toalsales*commisionrate;
    }
    static  int Power(int w,int t){
        return w/t;
    }

    static  int DepreciationofValue(int c,int e,int a){
        return  (c-e)/a;
    }

    static  int BattingAvg(int runs,int outs){
        return runs/outs;
    }

    static  double CGPA(int g,int sub){
        return g/sub;
    }

    static  int CompondInterest(int p,int r,int t){
        return p * (1 + (r / 100))^t;
    }

    static  int Averagemarks(int[] array,int n){
        int total=0;
        for(int i=0;i< array.length;i++){
            total=total+array[i];
        }
        return total/n;
    }

    static  int SumofNNumbers(int n){
        int total=0;
        for(int i=1;i<=n;i++){
            total=total+i;
        }
        return total;
    }

    static  boolean ArmstromNumber(int ori){
            int n;
            int result = 0;
            n=ori;
    while (n!=0){
       int  remainder=n%10;
        result +=Math.pow(remainder,3);
        n/=10;
    }
    return result==ori;

    }

    static int Ncr(int n,int r){
            int a1=Factorial(n);
            int a2=Factorial(r);
            int a3=Factorial(n-r);
            return  a1/a2*a3;
    }

    static int Npr(int n,int r){
        int a1=Factorial(n);
        int a3=Factorial(n-r);
        return  a1/a3;
    }

    static String Reverse(String str){
        char ch;
        String nstr = "";
       for (int i=0;i<str.length();i++){
           ch=str.charAt(i);
           nstr = ch+nstr;
       }
       return nstr;
    }

    static boolean PalidromeorNot(String str){
        String second=Reverse(str);
        if (second==str){
            return true;
        }
        return false;
    }

    static  int Fv(int pv,int n){
        return (pv)*(1+4^n);
    }

    static int hcf(int n1, int n2) {
        int min = (n1 < n2) ? n1 : n2;
        int hcf = 1;

        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }


    static int LCM(int a,int b){
        int greater = Math.max(a, b);
        int smallest = Math.min(a, b);
        for (int i = greater;; i += greater) {
            if (i % smallest == 0)
                return i;
        }
    }

    static String VowelorConstent(char n){
        if (n == 'a' || n=='e' || n=='i' || n=='o' || n=='u'){
            return "Vowel";
        }else{
            return "Constant";
        }
    }

    static boolean PerfectNumber(int n){

        if (n == 1)
            return false;

        int sum=1;
        for(int i=2;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            return true;
        }else {
            return false;
        }
    }

    static Boolean LeapYear(int n){
        if ((n % 400 == 0) ||
                (n % 100 != 0) &&
                        (n % 4 == 0)){
            return true;
        }else{
            return false;
        }

    }

    static int SUmofDigits(int n){
        int sum=0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    static  int GotoOut(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if (i%2==0){
                count+=+1;
            }
        }
        return count;
    }

    static void SumofNegativeNumberPositivePositiveodd() {
        Scanner scanner = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (Enter 0 to stop):");
        while (true) {
            int n = scanner.nextInt(); // Read the next integer

            // Break the loop if the user enters 0
            if (n == 0) {
                break;
            }
            if (n < 0) {
                sumNegative += n;
            } else {
                // Check if the number is even
                if (n % 2 == 0) {
                    sumPositiveEven += n;
                }
                // If it's odd
                else {
                    sumPositiveOdd += n;
                }
            }
        }
        System.out.println(sumNegative);
        System.out.println(sumPositiveEven);
        System.out.println(sumPositiveOdd);
    }
}
