public class NumberofTimesChar {
    public static void main(String[] args) {

//        int n=1385757879;
//        String s=String.valueOf(n);
//
//        int temp=0;
//        for(int i=0;i<s.length();i++){
//            if (s.charAt(i) =='7'){
//                temp++;
//            }else if (i == s.length() - 1 && temp == 0){
//                System.out.println("Not Found!!!");
//            }
//        }
//        System.out.println(temp);

        int n= 45536;
        int count=0;
        while (n>0){
            int rem=n%10;
            if (rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
